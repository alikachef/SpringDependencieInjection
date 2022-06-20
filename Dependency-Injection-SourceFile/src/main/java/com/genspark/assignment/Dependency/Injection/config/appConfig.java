package com.genspark.assignment.Dependency.Injection.config;

import com.genspark.assignment.Dependency.Injection.components.Address;
import com.genspark.assignment.Dependency.Injection.components.Phone;
import com.genspark.assignment.Dependency.Injection.components.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class appConfig {
    @Bean
    public Student getStudent(){
        return new Student(9013, "Ali", List.of(new Phone("(909) 654-8798")), new Address("Midlothian", "VA", "USA", "23112"));
    }
}
