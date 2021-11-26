package com.samsung.careers.service;

import com.samsung.careers.dto.BoardDto;
import com.samsung.careers.dto.ProductsDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Test
    void selectAll() {
        List<BoardDto> rtn = boardService.findAll("Board.selectAll");
        System.out.println("rtn -->" + rtn.size());
    }

    @Test
    void insert(){
        // given
        BoardDto boardDto = new BoardDto();
        boardDto.setTitle("게시판 제목입니다.");
        boardDto.setName("name....");
        boardDto.setContent("게시판 내용... test");
        boardDto.setDtReg(new Date());
        //when
        int rtn = boardService.input("Board.insert",boardDto);
        //then
        assertThat(rtn).isEqualTo(1);
    }



}