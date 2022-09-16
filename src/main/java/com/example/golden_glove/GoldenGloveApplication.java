package com.example.golden_glove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@ComponentScan(basePackages = "main")
@ComponentScan(basePackages = "user")
@ComponentScan(basePackages = "team")
@ComponentScan(basePackages = "teammatch")
@ComponentScan(basePackages = "notice")
@ComponentScan(basePackages = "ranking")

@MapperScan(basePackages = "user")
@MapperScan(basePackages = "team")
@MapperScan(basePackages = "teammatch")
@MapperScan(basePackages = "notice")
@MapperScan(basePackages = "ranking")
public class GoldenGloveApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldenGloveApplication.class, args);
	}

}
