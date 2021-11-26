package com.samsung.careers.service;

import com.samsung.careers.dto.BoardDto;

import java.util.List;

public interface BoardService {

    int input(String strID , BoardDto params);
    List<BoardDto> findAll(String strID);

}
