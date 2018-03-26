package com.springboot.mysql.mainappentry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.springboot.mysql.controller"})
public class SpringMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringMainApp.class, args);

	}

}
