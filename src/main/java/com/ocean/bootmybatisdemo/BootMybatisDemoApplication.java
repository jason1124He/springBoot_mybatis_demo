package com.ocean.bootmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ocean.dao")
@ComponentScan(basePackages = {"com.ocean.*"})
public class BootMybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMybatisDemoApplication.class, args);
	}
}
