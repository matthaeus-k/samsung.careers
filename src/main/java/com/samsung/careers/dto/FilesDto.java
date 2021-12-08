package com.samsung.careers.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

public class FilesDto {

    private MultipartFile[] multiPartFile;
    private Long fileSize;
    private String saveFileName;
    private String realFileName;
    private String fileDir;
    private String filePath;
    private String fileType;
    private String uploadType;


    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    private String profiles;

    public MultipartFile[] getMultiPartFile() {
        return multiPartFile;
    }

    public void setMultiPartFile(MultipartFile[] multiPartFile) {
        this.multiPartFile = multiPartFile;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getSaveFileName() {
        return saveFileName;
    }

    public void setSaveFileName(String saveFileName) {
        this.saveFileName = saveFileName;
    }

    public String getRealFileName() {
        return realFileName;
    }

    public void setRealFileName(String realFileName) {
        this.realFileName = realFileName;
    }

    public String getFileDir() {
        return fileDir;
    }

    public void setFileDir(String fileDir) {
        this.fileDir = fileDir;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getProfiles() {
        return profiles;
    }

    public void setProfiles(String profiles) {
        this.profiles = profiles;
    }

    public String getFileType() {
        return fileType;
    }

    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    @Override
    public String toString() {
        return "FilesDto{" +
                "multiPartFile=" + Arrays.toString(multiPartFile) +
                ", fileSize=" + fileSize +
                ", saveFileName='" + saveFileName + '\'' +
                ", realFileName='" + realFileName + '\'' +
                ", fileDir='" + fileDir + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileType='" + fileType + '\'' +
                ", profiles='" + profiles + '\'' +
                '}';
    }
}
