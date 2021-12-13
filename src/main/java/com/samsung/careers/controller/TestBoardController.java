package com.samsung.careers.controller;

import com.samsung.careers.dto.Result;
import com.samsung.careers.dto.TestBoardDto;
import com.samsung.careers.service.TestBoardService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestBoardController extends BaseController {
   private final TestBoardService testBoardService;

    public TestBoardController(TestBoardService testBoardService) {
        this.testBoardService = testBoardService;
    }

    @GetMapping("/testBoardList")
    public String tblBoardsList(ModelMap modelMap){
        Result result = testBoardService.testBoardSelectAll();
        modelMap.addAttribute("result",result);
        return "/web/testBoardList";
    }

    @GetMapping("/testBoardWrite")
    public String testBoardWrite(HttpServletRequest req){
        return viewPath("testBoardWrite",req);
    }

    @PostMapping("/testBoardInsert")
    public @ResponseBody Result testBoardInsert(TestBoardDto testBoardDto){
        return testBoardService.testBoardInsert(testBoardDto);
    }

    @GetMapping("/testBoardEdit/{idx}")
    public String testBoardEdit(@PathVariable String idx,ModelMap modelMap){
        Result result = testBoardService.testBoardSelectOne(idx);
        modelMap.addAttribute("result",result);
        return "/web/testBoardEdit";
    }

    @PostMapping("/testBoardUpdate")
    public @ResponseBody Result testBoardUpdate(TestBoardDto testBoardDto){
        return testBoardService.testBoardUpdate(testBoardDto);
    }

    @PostMapping("/testBoardDelete")
    public @ResponseBody Result testBoardDelete(TestBoardDto testBoardDto){
        return testBoardService.testBoardDelete(testBoardDto);
    }

    @GetMapping("/testBoardView/{idx}")
    public String testBoardView(@PathVariable String idx,ModelMap modelMap){
       Result result = testBoardService.testBoardView(idx);
       modelMap.addAttribute("result",result);
        return "/web/testBoardView";
    }








}
