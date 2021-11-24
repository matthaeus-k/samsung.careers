package com.samsung.careers.repository;

import com.samsung.careers.dto.ProductsDto;

import java.util.List;

public interface ProductsRepository {
    List<ProductsDto> findAll();
}
