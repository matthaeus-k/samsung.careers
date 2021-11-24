package com.samsung.careers.service;

import com.samsung.careers.dto.ProductsDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@Slf4j
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService ;

    @Test
    void selectAll() {
        List<ProductsDto> rtn = productService.selectAllList();
        System.out.println("rtn -->" + rtn.size());
    }
}