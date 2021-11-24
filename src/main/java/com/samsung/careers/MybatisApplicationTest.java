package com.samsung.careers;

import com.samsung.careers.repository.ProdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

// @SpringBootApplication(exclude = WebMvcAutoConfiguration.class)
public class MybatisApplicationTest implements CommandLineRunner {

    public static void main(String[] args) {
       // SpringApplication.run(MybatisApplicationTest.class,args);
    }

    private final ProdRepository prodRepository;

    public MybatisApplicationTest(ProdRepository prodRepository) {
        this.prodRepository = prodRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("mybatisApplication --> " + prodRepository.findAll().toString());
    }
}
