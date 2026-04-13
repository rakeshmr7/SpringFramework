package com.example.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_core.config.MyConfig;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		// ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");		
		
		
		// Department d1 = (Department) context.getBean("dept1");
		// System.out.println(d1);
		// Department d2 = (Department) context.getBean("dept2");
		// System.out.println(d2);
		// Employee e1 = d1.getEmp();
		// System.out.println(e1);
		// Employee e2 = d2.getEmp();
		// System.out.println(e2);

		// Mobile m1 = (Mobile) context.getBean("mob1");
		// System.out.println(m1);
		// Mobile m2 = (Mobile) context.getBean("mob2");
		// System.out.println(m2);

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		College c1 = (College) context.getBean("c1");
		System.out.println(c1);

		System.out.println("Student Name: " + c1.getStudent().getName());
		System.out.println("Marks: " + c1.getStudent().getMarks());

	}

}
