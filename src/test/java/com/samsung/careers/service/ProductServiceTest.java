package com.samsung.careers.service;

import com.samsung.careers.dto.ProductsDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


@Slf4j
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private SampleService sampleService;

    @Test
    void selectAll() {
        List<ProductsDto> rtn = sampleService.selectAll();
        System.out.println("rtn -->" + rtn.size());
    }

    @Test
    void insert(){
        // given
        ProductsDto params = new ProductsDto();
        params.setProd_name("HP 노트북");
        params.setProd_price(3250000);
        // when
        int rtn = sampleService.insert(params) ;
        // then
        System.out.println("rtn -->" + rtn);
        assertThat(rtn).isEqualTo(1);

    }
}