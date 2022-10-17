package com.sujalchoudhari;

interface GPS{
	default void findLocation() {
		System.out.println("Finding Location");
	}
	
	default void connect() {
		System.out.println("Conecting...");		
	}
}
	
interface Camera{
	default void snap() {
		System.out.println("Taking Picture...");				
	}
}

class SmartPhone implements GPS,Camera{
	public void call() {		
		System.out.println("Calling...");				
	}
	
	static void capture(Camera cam) {
		System.out.println("Capturing...");
		cam.snap();
	}
}

public class NOTES_19_OOPS_Polymorphism {

	public static void main(String[] args) {
		//Camera phone = new SmartPhone();
		//phone.call(); not allowed
		//phone.connect(); not allowed
		//phone.snap();
		SmartPhone phone = new SmartPhone();
		SmartPhone.capture(phone); // takes Camera
	}
}
