package com.samsung.careers.dto;

public class FilesResponseDto {

    private Long fileSize;
    private String saveFileName;
    private String realFileName;
    private String fileDir;
    private String filePath;
    private String fileType;
    private String uploadType;

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

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    @Override
    public String toString() {
        return "FilesResponseDto{" +
                "fileSize=" + fileSize +
                ", saveFileName='" + saveFileName + '\'' +
                ", realFileName='" + realFileName + '\'' +
                ", fileDir='" + fileDir + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileType='" + fileType + '\'' +
                ", uploadType='" + uploadType + '\'' +
                '}';
    }
}
