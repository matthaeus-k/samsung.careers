package com.samsung.careers.service;

import com.samsung.careers.dao.CommonDao;
import com.samsung.careers.dto.ProductsDto;

import java.util.List;

public class SampleServiceImpl implements SampleService {

//    @Autowired
//    private CommonDao commonDao;

    private final CommonDao commonDao;

    public SampleServiceImpl(CommonDao commonDao) {
        this.commonDao = commonDao;
    }


    @Override
    public List<ProductsDto> selectAll() {
        return commonDao.SelectAll("Products.findAll") ;
    }

    @Override
    public int insert(ProductsDto params) {
       return commonDao.insert("Products.insert",params);
    }
}
