package com.samsung.careers.service;

import com.samsung.careers.dto.BoardDto;
import com.samsung.careers.dto.ParamsDto;
import com.samsung.careers.dto.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.ServletContext;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Autowired
    ServletContext servletContext;

    @Test
    void selectAll() {
        List<BoardDto> rtn = boardService.selectAll();
        System.out.println("rtn -->" + rtn.size());
        //System.out.println("path--->" + servletContext.getRealPath("/"));

    }

    @Test
    void selectList(){
        ParamsDto params = new ParamsDto();
        Result rtn = boardService.selectList(params);
        System.out.println(rtn.getData());
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