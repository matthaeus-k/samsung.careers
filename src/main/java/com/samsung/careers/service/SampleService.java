package com.samsung.careers.service;

import com.samsung.careers.dto.ProductsDto;

import java.util.List;

public interface SampleService {
    List<ProductsDto> selectAll();
    int insert(ProductsDto params);


}
