package com.samsung.careers.dao;

import java.util.List;

public interface CommonDao {
    void logQuery(String strID);
    List SelectAll(String strID);
    List SelectList(String strID);
    List SelectList(String strID , Object params );
    Object selectOne(String strID , Object params );
    int insert(String strID , Object params) ;
    int insert(String strID);
    int Delete(String strID , Object params);
    int Delete(String strID);
    int update(String strID , Object params);
}
