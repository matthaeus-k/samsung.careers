package com.samsung.careers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController extends BaseController {

    @GetMapping("/")
    public String index(HttpServletRequest req){
        return viewPath("index",req) ;
    }

}
