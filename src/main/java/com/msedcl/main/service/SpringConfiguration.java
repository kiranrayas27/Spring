package com.msedcl.main.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = "com.msedcl.main")
@EnableAspectJAutoProxy
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Default Constructor Called - SpringConfiguration");
	}

	
}
