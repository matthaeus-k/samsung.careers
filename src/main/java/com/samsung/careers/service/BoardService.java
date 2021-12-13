package com.samsung.careers.service;

import com.samsung.careers.dto.BoardDto;
import com.samsung.careers.dto.ParamsDto;
import com.samsung.careers.dto.Result;

import java.util.List;

public interface BoardService {

    int input(String strID , BoardDto params);
    List<BoardDto> selectAll();
    Result selectAllList(ParamsDto params);
    Result selectList(ParamsDto params) ;



}
