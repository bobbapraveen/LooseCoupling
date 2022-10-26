package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LooseCouplingApplication {

	public static void main(String[] args) {

		SpringApplication.run(LooseCouplingApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Jio s = context.getBean("jio",Jio.class);
		s.activateService();

	}

}
