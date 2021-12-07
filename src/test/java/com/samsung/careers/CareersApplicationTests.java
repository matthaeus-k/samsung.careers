package com.samsung.careers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.MessageSourceAccessor;

import java.util.Locale;

@SpringBootTest
class CareersApplicationTests {


	public static void main(String[] args) {
		//SpringApplication.run(CareersApplicationTests.class, args);
		Locale[] locales = Locale.getAvailableLocales();

		String msg = "";
		System.out.println(msg);

		for(Locale locale : locales){
			System.out.println(locale);

		}
	}

}
