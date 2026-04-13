package com.example.simple_ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SimpleEcommerceApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Cart cart1 = (Cart) context.getBean("c1");
		System.out.println(cart1);
		Cart cart2 = (Cart) context.getBean("c2");
		System.out.println(cart2);

	}

}
