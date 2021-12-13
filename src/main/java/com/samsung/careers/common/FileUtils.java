package com.samsung.careers.common;

import ch.qos.logback.classic.Logger;
import com.samsung.careers.dto.FilesDto;
import com.samsung.careers.dto.FilesResponseDto;
import com.samsung.careers.dto.Result;
import com.samsung.careers.exception.CustomException;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class FileUtils {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(FileUtils.class);

    public Result fileUPload(FilesDto dto) throws IOException {

        MultipartFile[] multipartFiles = dto.getFiles();
        Map<String, Object> rtnData = new HashMap<String, Object>();
        ArrayList<FilesResponseDto> listFile = new ArrayList<FilesResponseDto>();
        int i = 0; FileOutputStream fos = null; Boolean isRtn = false;
        String uid = UUID.randomUUID().toString();

        String strPath = dto.getFilePath() + File.separator +"tempfiles"+ File.separator + uid;
        String strDist = dto.getFilePath() + File.separator + "upload" + File.separator + dto.getFileDir() ;

        for(MultipartFile file : multipartFiles ){

            //----- ST 파일 검증 ------//
            if(file.getSize() > Const.FILE_MAX_SIZE){
                throw new CustomException(CommonExceptionType.FILE_SIZE);
            }
            if(dto.getFileType() == Const.UPLOAD_IMG){
                if(!file.getContentType().startsWith("image")){
                    throw new CustomException(CommonExceptionType.FILE_TYPE);
                }
            }
            if(dto.getUploadType() == Const.UPLOAD_DOC){
                if(!fileExtension(file.getName(),Const.EXTENSION_FILE)){
                    throw new CustomException(CommonExceptionType.FILE_TYPE);
                }
            }
            //----- END 파일 검증 ------//

            String originalFile = file.getOriginalFilename();
            Long fileSize = file.getSize();
            byte fileData[] = file.getBytes();
            String saveFileName = makeFileName(originalFile,strPath,dto.getProfiles());
            fos = new FileOutputStream(strPath  + File.separator + saveFileName);
            fos.write(fileData);
            FilesResponseDto entity = new FilesResponseDto();
            entity.setFilePath(strPath);
            entity.setFileDir(uid);
            entity.setRealFileName(originalFile);
            entity.setSaveFileName(saveFileName);
            listFile.add(i,entity);
            i++;
            isRtn = true;
        }
        rtnData.put("files",listFile);
        FileUtils.mvFiles(strPath , strDist);
        return new Result(isRtn, rtnData);
    }

    public String makeFileName(String fileName, String filePath ,String strProfiles){
        String milli = "" + System.currentTimeMillis();
        System.out.println(fileName.lastIndexOf("."));
        String strRtn = milli + fileName.substring(fileName.lastIndexOf("."),fileName.length());
        String strPath = filePath;
        FileUtils.mkDir(strPath,strProfiles);
        return strRtn;
    }

    public static Boolean fileExtension(String fileName, String[] extension) {
        Boolean flag = false;
        String ext = ext(fileName);

        if (extension.length > 0) {
            for (int i = 0; i < extension.length; i++) {
                if (ext.equalsIgnoreCase(extension[i])) {
                    flag = true;
                }
            }
        }

        return flag;
    }


    public static String ext(String fileName) {

        String extension = "";

        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0) {
            extension = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
        }
        return extension;
    }

    public static void mkDir(String path, String profiles) {
        File dir = new File(path);
        boolean success = false;
//		dir.setExecutable(true, true);
//		dir.setReadable(true);
//		success = dir.setWritable(true, true);
//		if (!success) {
//			log.error("filedir-디렉토리 생성오류");
//		}
        if (!dir.exists()) {
            success = dir.mkdirs();
            if (!success) {
                logger.error("dir exists error");
            }
        }
    }

    /**
     * Directory move
     *
     * @param  st 파일경로 , dist 파일경로
     * @return void
     */
    public static void mvFiles(String st , String dist) throws IOException {
        File from = org.apache.commons.io.FileUtils.getFile(st);
        File to = org.apache.commons.io.FileUtils.getFile(dist);
        org.apache.commons.io.FileUtils.moveDirectory(from,to);
    }

}
