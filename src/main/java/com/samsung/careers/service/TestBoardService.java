package com.samsung.careers.service;

import com.samsung.careers.dto.Result;
import com.samsung.careers.dto.TestBoardDto;

public interface TestBoardService {
    Result testBoardSelectAll();

    Result testBoardInsert(TestBoardDto params);

    Result testBoardSelectOne(Object params);

    Result testBoardUpdate(TestBoardDto params);

    Result testBoardDelete(TestBoardDto params);

    Result testBoardView(Object idx);
}
