package com.samsung.careers.controller;

import com.samsung.careers.common.Const;
import com.samsung.careers.dto.BoardDto;
import com.samsung.careers.dto.Result;
import com.samsung.careers.service.BoardService;
import com.samsung.careers.validator.sampleValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import java.util.List;

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
        modelMap.addAttribute(Const.KEY_RESULT, rtn);
        return "web/list.html";
    }

    @RequestMapping(value = "/validate.json", method = RequestMethod.POST)
    @ResponseBody
    public Result validate(BoardDto params , BindingResult bindingResult)  {
       new sampleValidator().validate(params,bindingResult);
       if(bindingResult.hasErrors()){
           List<FieldError> errors = bindingResult.getFieldErrors();
           for(FieldError error : errors){
                return new Result(false, "messages",error.getField());
           }
       }
        return new Result(true,"200");
    }


    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    public int addJson(HttpServletRequest req, BoardDto params)  {
       params.setContent("conttn....");
       params.setTitle("title.....1");
       params.setName("dlwjdgml");
       params.setDtReg(new Date());

       return boardService.input("",params);
    }

}
