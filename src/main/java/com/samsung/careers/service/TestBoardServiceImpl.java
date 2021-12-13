package com.samsung.careers.service;

import com.samsung.careers.common.Const;
import com.samsung.careers.dao.CommonDao;
import com.samsung.careers.dto.Result;
import com.samsung.careers.dto.TestBoardDto;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestBoardServiceImpl implements TestBoardService {

    private final CommonDao commonDao;
    public TestBoardServiceImpl(CommonDao commonDao){this.commonDao = commonDao;}

    @Override
    public Result testBoardSelectAll() {
        Map<String, Object> data = new HashMap<String, Object>();
        List<TestBoardDto> list = commonDao.SelectAll("TestBoard.selectAll");
        data.put(Const.KEY_ITEMS, list);
        return new Result(true, "TestBoardSelectAll 성공", "202", data);
    }

    @Override
    public Result testBoardInsert(TestBoardDto params) {
        Date now = new Date();
        params.setDtReg(now);
        params.setDtUpd(now);

        int result = commonDao.insert("TestBoard.insert",params);
        Map<String,Object> data = new HashMap<>();
        data.put(Const.KEY_ITEMS,result);
        return new Result(true, "TestBoardInsert 성공", "202", data);
    }

    @Override
    public Result testBoardSelectOne(Object params) {
        TestBoardDto result = (TestBoardDto) commonDao.selectOne("TestBoard.selectOne",params);
        Map<String,Object> data = new HashMap<>();
        data.put(Const.KEY_ITEMS,result);
        return new Result(true, "TestBoardSelectOne 성공", "202", data);
    }

    @Override
    public Result testBoardUpdate(TestBoardDto params) {
        Date now = new Date();
        params.setDtUpd(now);

        int result = commonDao.update("TestBoard.update",params);
        Map<String,Object> data = new HashMap<>();
        data.put(Const.KEY_ITEMS,result);
        return new Result(true, "TestBoardUpdate 성공", "202", data);
    }

    @Override
    public Result testBoardDelete(TestBoardDto params) {
        Date now = new Date();
        params.setDtUpd(now);
        params.setIsDlt("D");
        int result = commonDao.Delete("TestBoard.delete",params);
        Map<String,Object> data = new HashMap<>();
        data.put(Const.KEY_ITEMS,result);
        return new Result(true, "TestBoardDelete 성공", "202", data);
    }

    @Override
    public Result testBoardView(Object params) {
        TestBoardDto oldResult = (TestBoardDto) commonDao.selectOne("TestBoard.selectOne",params);
        oldResult.setViewCnt(oldResult.getViewCnt()+1);
        commonDao.update("TestBoard.updateViewCnt",oldResult);

        return testBoardSelectOne(params);
    }

}
