package com.samsung.careers.dto;

public class ParamsDto extends Pagination {

    private Long intNo;         //  게시물 idx
    private String strKey;      // 검색 구분
    private String strTxt;      // 검색어

    private String strUserID;
    private String strUserName;
    private String strUserEmil;

    public Long getIntNo() {
        return intNo;
    }

    public void setIntNo(Long intNo) {
        this.intNo = intNo;
    }

    public String getStrKey() {
        return strKey;
    }

    public void setStrKey(String strKey) {
        this.strKey = strKey;
    }

    public String getStrTxt() {
        return strTxt;
    }

    public void setStrTxt(String strTxt) {
        this.strTxt = strTxt;
    }

    public String getStrUserID() {
        return strUserID;
    }

    public void setStrUserID(String strUserID) {
        this.strUserID = strUserID;
    }

    public String getStrUserName() {
        return strUserName;
    }

    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }

    public String getStrUserEmil() {
        return strUserEmil;
    }

    public void setStrUserEmil(String strUserEmil) {
        this.strUserEmil = strUserEmil;
    }
}
