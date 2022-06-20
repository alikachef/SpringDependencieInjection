package com.genspark.assignment.Dependency.Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionApplication {

	public static void main(String[] args) {

		// XML Configuration Dependency Injection
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.toString());
		context.close();

	}

}
