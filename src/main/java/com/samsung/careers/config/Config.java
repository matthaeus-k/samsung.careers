package com.samsung.careers.config;

import com.samsung.careers.common.TimeTraceAop;
import com.samsung.careers.dao.CommonDao;
import com.samsung.careers.dao.CommonDaoImpl;
import com.samsung.careers.service.BoardService;
import com.samsung.careers.service.BoardServiceImpl;
import com.samsung.careers.service.SampleService;
import com.samsung.careers.service.SampleServiceImpl;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class Config {
//
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames("classpath:/messages/message");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(60);
        messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }


    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("lang");
        return interceptor;
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
