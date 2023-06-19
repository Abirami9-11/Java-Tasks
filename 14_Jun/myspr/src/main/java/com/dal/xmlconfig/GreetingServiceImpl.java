package com.dal.xmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceImpl implements GreetingService {
	@Value("Good Eve")
	@Autowired
	private String greeting;
	

	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	@Override
	public void sayHi() {
		System.out.println("Hi " +greeting);
	}
}
