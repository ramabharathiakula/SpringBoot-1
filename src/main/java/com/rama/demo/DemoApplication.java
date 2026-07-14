package com.rama.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		student student=context.getBean(student.class);
	 	student.setName("Harsha Pavan");
	 	student.setAge(20);
		System.out.println(student.getAge());
		System.out.println(student.getName());



	}

}
