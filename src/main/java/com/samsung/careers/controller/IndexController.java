package com.samsung.careers.controller;

import com.samsung.careers.common.Const;
import com.samsung.careers.dto.BoardDto;
import com.samsung.careers.dto.Result;
import com.samsung.careers.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController extends BaseController {

    private final BoardService boardService;

    public IndexController(BoardService boardService) {
        this.boardService = boardService;
    }


    @GetMapping("/")
    public String index(HttpServletRequest req){
        return viewPath("index",req) ;
    }


    @GetMapping("/list")
    public String list(ModelMap modelMap,HttpServletRequest req){
        return viewPath("list",req);
    }

    @PostMapping("/list.data")
    public String listData(ModelMap modelMap){
        Result rtn = boardService.findAllList();
        modelMap.addAttribute(Const.kEY_RESULT, rtn);
        return "web/list.html";
    }

}
