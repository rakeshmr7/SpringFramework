package com.example.auto_wiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.auto_wiring.config.MyConfiguration;

@SpringBootApplication
public class AutoWiringApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Refrigerator rf = context.getBean(Refrigerator.class);
		System.out.println(rf);
		System.out.println(rf.getCompressor());
	}

}
