package com.samsung.careers.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BoardDto {

    private Long idx ;
    private String title ;
    private String content;
    private String name  ;
    private String is_dlt ;
    // 등록일시
    @DateTimeFormat(pattern = "yyyy-MM-dd H:m:s")
    private Date dtReg ;

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIs_dlt() {
        return is_dlt;
    }

    public void setIs_dlt(String is_dlt) {
        this.is_dlt = is_dlt;
    }

    public Date getDtReg() {
        return dtReg;
    }


    public void setDtReg(Date dtReg) {
        this.dtReg = dtReg;
    }
}
