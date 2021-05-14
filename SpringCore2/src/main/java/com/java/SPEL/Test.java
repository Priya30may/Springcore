package com.java.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spel/bean.xml");
		Spel b1 = context.getBean("demo",Spel.class);
		
		System.out.println(b1);

	}

}
