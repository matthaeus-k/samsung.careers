package com.samsung.careers.dao;

import java.util.List;

public interface CommonDao {
    void logQuery(String strID);
    List SelectAll(String strID);
    Object selectOne(String strID , Object params );
    int insert(String strID , Object params) ;
}
