package com.samsung.careers.dao;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class CommonDaoImpl implements CommonDao {

    private final SqlSessionTemplate sqlSessionTemplate;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public CommonDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public void logQuery(String strID) {
        logger.info("----------" + strID + "--------------");
    }

    @Override
    public List SelectAll(String strID) {
        logQuery(strID);
        return sqlSessionTemplate.selectList(strID);
    }

    @Override
    public Object selectOne(String strID, Object params) {
        return sqlSessionTemplate.selectOne(strID,params);
    }

    @Override
    public int insert(String strID, Object params) {
        return sqlSessionTemplate.insert(strID,params);
    }
}
