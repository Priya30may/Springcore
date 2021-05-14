package com.java.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/java/lifecycle/bean.xml");
		
		context.registerShutdownHook();
		
		Lifecycle example=(Lifecycle) context.getBean("example");
		System.out.println(example);
		

	}

}
