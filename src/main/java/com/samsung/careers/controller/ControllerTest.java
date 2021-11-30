package com.samsung.careers.controller;

import com.samsung.careers.exception.InternalException;
import com.samsung.careers.exception.NotFoundException;
import com.samsung.careers.service.SampleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTest {

    private final SampleService sampleService;

    public ControllerTest(SampleService sampleService) {
        this.sampleService = sampleService;
    }


    @GetMapping("main")
    public String hello() throws Exception {
        //  System.out.println("controllerTest --> " + prodRepository.findAll().toString());
        System.out.println("controllerTest ---> " + sampleService.selectAll().toString());
        Exception ex = new InternalException("500");
        throw ex;


    }


}
