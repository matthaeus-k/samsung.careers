package com.samsung.careers.service;

import com.samsung.careers.common.CommonExceptionType;
import com.samsung.careers.common.Const;
import com.samsung.careers.dao.CommonDao;
import com.samsung.careers.dto.BoardDto;
import com.samsung.careers.dto.ParamsDto;
import com.samsung.careers.dto.Result;
import com.samsung.careers.exception.CustomException;

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
        if(strID.isEmpty()){
            throw new CustomException(CommonExceptionType.INTERNAL_SERCER);
        }
        return commonDao.insert(strID,params);
    }

    @Override
    public List<BoardDto> selectAll() {
        return commonDao.SelectAll("Board.selectAll");
    }

    @Override
    public Result selectAllList(ParamsDto params) {
        Map<String, Object> data = new HashMap<String, Object>();

        List<BoardDto> list = commonDao.SelectAll("Board.selectAll");
        data.put(Const.KEY_ITEMS, list);

        return new Result(true, data);
    }

    @Override
    public Result selectList(ParamsDto params) {
        Map<String, Object> data = new HashMap<String, Object>();

        int intTotalCnt = (Integer) commonDao.selectOne("Board.selectCount",params);
        params.setTotalRecordCount(intTotalCnt);
        params.paginate();

        List<BoardDto> list = (List<BoardDto>) commonDao.SelectList("Board.selectList",params);
        data.put(Const.KEY_ITEMS, list);
        data.put(Const.KEY_PARAMS,params);
        return new Result(true,data);
    }
}
