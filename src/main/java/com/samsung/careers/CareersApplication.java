package com.samsung.careers;

import com.samsung.careers.config.MyBatisConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CareersApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareersApplication.class, args);
	}

}
