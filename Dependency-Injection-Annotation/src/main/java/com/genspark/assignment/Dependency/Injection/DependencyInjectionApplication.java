package com.genspark.assignment.Dependency.Injection;

import com.genspark.assignment.Dependency.Injection.components.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionApplication {

	public static void main(String[] args) {

//		AbstractApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Student student = (Student) context.getBean("studentC");
		System.out.println(student.toString());
		context.close();

	}

}
