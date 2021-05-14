package com.java.springcore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	Customer c1 = new Customer(1,"Priya","8248660299",new Address("Chennai","Tamilnadu","ch","600063","India"));
	
    @Test
	public void draw() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer c = (Customer) context.getBean("customer");
		assertEquals(c1.getCustID(), c.getCustID());
		assertEquals(c1.getCustName(), c.getCustName());
	}

}
