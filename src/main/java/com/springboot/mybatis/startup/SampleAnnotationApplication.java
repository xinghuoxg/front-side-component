package com.springboot.mybatis.startup;

import com.springboot.mybatis.city.CityMapper;
import com.springboot.mybatis.config.MyWebAppConfigurer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(basePackages = "com.springboot.mybatis.*")
public class SampleAnnotationApplication extends MyWebAppConfigurer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SampleAnnotationApplication.class, args);
    }
    @Autowired
    CityMapper cityMapper;

    public SampleAnnotationApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.cityMapper.findByState("CA"));
    }

}