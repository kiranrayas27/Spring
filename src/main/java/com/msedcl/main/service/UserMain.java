package com.msedcl.main.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UserMain {

	public static void main(String[] args) {
		System.out.println("main start");	
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class);

		UserService userService = applicationContext.getBean(UserService.class);

		userService.createUser("Reema");

		applicationContext.close();
		System.out.println("main end");
	}

}
