package com.java.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Spel {
	
	@Value("#{ 23+12 }")
	private int a;
	
	@Value("#{ 20 }")
	private int b;
	public int getX() {
		return a;
	}
	public void setX(int x) {
		this.a = x;
	}
	public int getY() {
		return b;
	}
	public void setY(int y) {
		this.b = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + a + ", y=" + b + "]";
	}
	
	

}
