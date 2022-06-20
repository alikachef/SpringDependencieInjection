package com.genspark.assignment.Dependency.Injection;

import com.genspark.assignment.Dependency.Injection.components.Student;
import com.genspark.assignment.Dependency.Injection.config.appConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionApplication {

	public static void main(String[] args) {

		// XML Configuration Dependency Injection
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
		Student student = (Student) context.getBean(Student.class);
		System.out.println(student.toString());
		context.close();

	}

}
