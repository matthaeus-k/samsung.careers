package com.samsung.careers.service;

import com.samsung.careers.common.Const;
import com.samsung.careers.dao.CommonDao;
import com.samsung.careers.dto.BoardDto;
import com.samsung.careers.dto.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List<BoardDto> findAll() {
        return commonDao.SelectAll("Board.selectAll");
    }

    @Override
    public Result findAllList() {
        Map<String, Object> data = new HashMap<String, Object>();

        List<BoardDto> list = commonDao.SelectAll("Board.selectAll");
        data.put(Const.KEY_ITEMS, list);

        return new Result(true, data);
    }
}
