package com.samsung.careers.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

    @Slf4j
    @Configuration
    @ComponentScan(basePackages = {"com.samsung.careers"})
    public class MyBatisConfig {

        @Bean
        public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sessionFactory) {
            return new SqlSessionTemplate(sessionFactory);
        }

        @Bean
        public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setConfigLocation(
                new PathMatchingResourcePatternResolver().getResource("classpath:config/mybatis-config.xml"));
        factoryBean.setMapperLocations( new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));

        return factoryBean.getObject();
    }
}
