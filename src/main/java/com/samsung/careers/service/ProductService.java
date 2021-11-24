package com.samsung.careers.service;


import com.samsung.careers.dao.CommonDAO;
import com.samsung.careers.dto.ProductsDto;
import com.samsung.careers.repository.ProdRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    private final ProdRepository prodRepository;
    private final CommonDAO commonDAO;

    public ProductService(ProdRepository prodRepository, CommonDAO commonDAO) {
        this.prodRepository = prodRepository;
        this.commonDAO = commonDAO;
    }

    public List<ProductsDto> selectAll(){
        return prodRepository.findAll();
    }

    public List<ProductsDto> selectAllList(){
        return commonDAO.selectList("Products.findAll");
    }



}
