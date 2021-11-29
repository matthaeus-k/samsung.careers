package com.samsung.careers.config;

import com.samsung.careers.dao.CommonDao;
import com.samsung.careers.dao.CommonDaoImpl;
import com.samsung.careers.service.BoardService;
import com.samsung.careers.service.BoardServiceImpl;
import com.samsung.careers.service.SampleService;
import com.samsung.careers.service.SampleServiceImpl;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private final SqlSessionTemplate sqlSessionTemplate;

    public Config(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Bean
    public SampleService sampleService(CommonDao commonDao){
        //return new SampleServiceImpl();   //@Autowired
        return new SampleServiceImpl(commonDao());
    }

    @Bean
    public BoardService boardService(CommonDao commonDao){
        return new BoardServiceImpl(commonDao());
    }

    @Bean
    public CommonDao commonDao(){
        return new CommonDaoImpl(sqlSessionTemplate);
    }

}
