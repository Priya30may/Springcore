package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/java/collections/bean.xml");
		
		Question q=(Question) context.getBean("questions");
		
		System.out.println(q);

	}

}
