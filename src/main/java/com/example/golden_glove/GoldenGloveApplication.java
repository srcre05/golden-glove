package com.example.golden_glove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@ComponentScan(basePackages = "main")
@ComponentScan(basePackages = "user")
@ComponentScan(basePackages = "team")
@ComponentScan(basePackages = "teammatch")
@ComponentScan(basePackages = "notice")
@ComponentScan(basePackages = "ranking")
@ComponentScan(basePackages = "chatbot")
@ComponentScan(basePackages = "sns")
@ComponentScan(basePackages = "teammatchinfo")
@ComponentScan(basePackages = "alarm")
@ComponentScan(basePackages = "soldier")
@ComponentScan(basePackages = "penalty")

@MapperScan(basePackages = "user")
@MapperScan(basePackages = "team")
@MapperScan(basePackages = "teammatch")
@MapperScan(basePackages = "notice")
@MapperScan(basePackages = "ranking")
@MapperScan(basePackages = "sns")
@MapperScan(basePackages = "teammatchinfo")
@MapperScan(basePackages = "alarm")
@MapperScan(basePackages = "soldier")
@MapperScan(basePackages = "penalty")

@SpringBootApplication
public class GoldenGloveApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(GoldenGloveApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(GoldenGloveApplication.class, args);
	}

}
