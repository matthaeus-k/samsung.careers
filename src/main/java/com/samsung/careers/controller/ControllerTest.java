package com.samsung.careers.controller;

import com.samsung.careers.service.SampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControllerTest {

    private final SampleService sampleService;

    public ControllerTest(SampleService sampleService) {
        this.sampleService = sampleService;
    }


    @GetMapping("main")
    public String hello(HttpServletRequest req) throws Exception {
        //  System.out.println("controllerTest --> " + prodRepository.findAll().toString());
        System.out.println("controllerTest ---> " + sampleService.selectAll().toString());
     //   throw  new InternalException(req,"500", errorCode);
      return "";

    }


}
