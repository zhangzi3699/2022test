package com.bjpowernode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * 有 @SpringBootApplication 这个注解的类 叫做启动类
 */
@SpringBootApplication
public class Boot05WebApplication {

	@Bean
	public Date myDate(){
		Date date = new Date();
		return date;
	}

	public static void main(String[] args) {
		SpringApplication.run(Boot05WebApplication.class, args);
	}

}
