package com.samsung.careers.repository;

import com.samsung.careers.dto.ProductsDto;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdRepository implements ProductsRepository {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<ProductsDto> findAll() {
        return sqlSessionTemplate.selectList("Products.findAll");
    }
}
