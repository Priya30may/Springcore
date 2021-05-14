package com.java.applcontxt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Applicationclass n = (Applicationclass) context.getBean("Hello");

		n.walk();

		Build a = (Build) context.getBean("Bye");
		a.Slow();

	}

}
