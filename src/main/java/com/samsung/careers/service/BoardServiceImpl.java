package com.samsung.careers.service;

import com.samsung.careers.dao.CommonDao;
import com.samsung.careers.dto.BoardDto;

import java.util.List;

public class BoardServiceImpl implements BoardService{

    private final CommonDao commonDao;

    public BoardServiceImpl(CommonDao commonDao) {
        this.commonDao = commonDao;
    }

    @Override
    public int input(String strID, BoardDto params) {
        return commonDao.insert(strID,params);
    }

    @Override
    public List<BoardDto> findAll(String strID) {
        return commonDao.SelectAll(strID);
    }
}
