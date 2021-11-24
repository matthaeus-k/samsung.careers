package com.samsung.careers.controller;

import com.samsung.careers.repository.ProdRepository;
import com.samsung.careers.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTest {

    private final ProdRepository prodRepository;
    private final ProductService productService;

    public ControllerTest(ProdRepository prodRepository, ProductService productService) {
        this.prodRepository = prodRepository;
        this.productService = productService;
    }

    @GetMapping("main")
    public String hello(){
      //  System.out.println("controllerTest --> " + prodRepository.findAll().toString());
        System.out.println("controllerTest ---> " + productService.selectAllList().toString());
        return "main";
    }


}
