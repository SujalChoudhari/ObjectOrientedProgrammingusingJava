package com.sujalchoudhari;
import EX_07.*;

public class EX_07_Packages {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10f,20.f);
		System.out.println(r.surfaceArea());
		
		Square s = new Square(10);
		System.out.println(s.surfaceArea());
		
		Circle c = new Circle(5);
		System.out.println(c.surfaceArea());
		
	}

}
