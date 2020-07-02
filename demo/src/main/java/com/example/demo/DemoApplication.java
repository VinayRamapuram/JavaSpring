package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Sample obj = context.getBean(Sample.class);
		obj.show();
//		Sample obj2 = context.getBean(Sample.class);
//		obj2.show();
	}
	

}
