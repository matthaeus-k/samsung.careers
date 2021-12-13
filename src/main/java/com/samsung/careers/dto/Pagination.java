package com.samsung.careers.dto;

import com.samsung.careers.common.Const;

public class Pagination {

    private Integer recordCountPerPage; // 한 페이지당 게시되는 게시물 건 수
    private Integer pageSize; // 페이지 리스트에 게시되는 페이지 건수
    private Integer firstPageNo; // 첫 페이지 번호
    private Integer prevPageNo; // 이전 페이지 번호
    private Integer startPageNo; // 시작 페이지
    private Integer currentPageNo; // 페이지 번호
    private Integer endPageNo; // 끝 페이지 번호
    private Integer nextPageNo; // 다음 페이지 번호
    private Integer lastPageNo; // 마지막 페이지 번호
    private Integer totalRecordCount; // 전체 게시물 건 수

    public Integer getRecordCountPerPage() {
        return recordCountPerPage == null ? Const.RECORD_COUNT_PER_PAGE : recordCountPerPage;
    }

    public void setRecordCountPerPage(Integer recordCountPerPage) {
        this.recordCountPerPage = recordCountPerPage;
    }

    public Integer getPageSize() {
        return pageSize == null ? Const.PAGE_SIZE : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getFirstPageNo() {
        return firstPageNo;
    }

    public void setFirstPageNo(Integer firstPageNo) {
        this.firstPageNo = firstPageNo;
    }

    public Integer getPrevPageNo() {
        return prevPageNo;
    }

    public void setPrevPageNo(Integer prevPageNo) {
        this.prevPageNo = prevPageNo;
    }

    public Integer getStartPageNo() {
        return startPageNo;
    }

    public void setStartPageNo(Integer startPageNo) {
        this.startPageNo = startPageNo;
    }

    public Integer getCurrentPageNo() {
        return currentPageNo == null ? Const.FIRST_PAGE_NO : currentPageNo;
    }

    public void setCurrentPageNo(Integer currentPageNo) {
        this.currentPageNo = currentPageNo;
    }

    public Integer getEndPageNo() {
        return endPageNo;
    }

    public void setEndPageNo(Integer endPageNo) {
        this.endPageNo = endPageNo;
    }

    public Integer getNextPageNo() {
        return nextPageNo;
    }

    public void setNextPageNo(Integer nextPageNo) {
        this.nextPageNo = nextPageNo;
    }

    public Integer getLastPageNo() {
        return lastPageNo;
    }

    public void setLastPageNo(Integer lastPageNo) {
        this.lastPageNo = lastPageNo;
    }

    public Integer getTotalRecordCount() {
        return totalRecordCount == null ? 0 : totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public void paginate() {
        int lastPage = (this.getTotalRecordCount() + (this.getRecordCountPerPage() - 1)) / this.getRecordCountPerPage();
        if (lastPage <= 0) {
            lastPage = 1;
        }
        if (this.getCurrentPageNo() > lastPage) {
            this.setCurrentPageNo(lastPage);
        } else if (getCurrentPageNo() < 0) {
            this.setCurrentPageNo(Const.FIRST_PAGE_NO);
        }
        boolean isFirst = this.getCurrentPageNo() == Const.FIRST_PAGE_NO;
        boolean isLast = this.getCurrentPageNo() == lastPage;
        int startPage = ((this.getCurrentPageNo() - 1) / this.getPageSize()) * this.getPageSize() + 1;
        int endPage = startPage + this.getPageSize() - 1;
        if (endPage > lastPage) {
            endPage = lastPage;
        }
        this.setFirstPageNo(Const.FIRST_PAGE_NO);
        if (isFirst) {
            this.setPrevPageNo(1); // 이전 페이지 번호
        } else {
            this.setPrevPageNo(this.getCurrentPageNo() - 1);
        }
        this.setStartPageNo(startPage);
        this.setEndPageNo(endPage);
        if (isLast) {
            this.setNextPageNo(lastPage);
        } else {
            this.setNextPageNo(this.getCurrentPageNo() + 1);
        }
        this.setLastPageNo(lastPage); // 마지막 페이지 번호
    }
}
