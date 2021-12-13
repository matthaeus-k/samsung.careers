package com.samsung.careers.dto;

import java.util.Date;

public class TestBoardDto {
    private Long idx;
    private String name;
    private String title;
    private String content;
    private String isDlt;
    private int viewCnt;
    private Date dtReg;
    private Date dtUpd;

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIsDlt() {
        return isDlt;
    }

    public void setIsDlt(String isDlt) {
        this.isDlt = isDlt;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    public Date getDtReg() {
        return dtReg;
    }

    public void setDtReg(Date dtReg) {
        this.dtReg = dtReg;
    }

    public Date getDtUpd() {
        return dtUpd;
    }

    public void setDtUpd(Date dtUpd) {
        this.dtUpd = dtUpd;
    }
}
