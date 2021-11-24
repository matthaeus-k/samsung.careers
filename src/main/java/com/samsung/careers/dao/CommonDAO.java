package com.samsung.careers.dao;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class CommonDAO {

    private SqlSessionTemplate sqlSessionTemplate;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public CommonDAO(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    private void printQueryId(String queryId) {
        logger.info("Query ID : " + queryId);
    }

    public List selectList(String queryId) {
        printQueryId(queryId);
        return sqlSessionTemplate.selectList(queryId);
    }



}
