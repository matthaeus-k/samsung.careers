package com.samsung.careers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =CareersApplication.class)
public class MessageTest {

    @Autowired
    private MessageSource messageSource;

    @Test
    public void messageTest(){
        //System.out.println("default::" + Locale.getDefault().getLanguage()); // ko
        //Locale locale = new Locale(Locale.ENGLISH.getLanguage(),Locale.US.getCountry());
        String message = messageSource.getMessage("common.board.msg001",null,Locale.KOREA);
        Assertions.assertThat(Locale.getDefault().getCountry()).isEqualTo("KR");
        System.out.println(" ---> " + message);

    }
}
