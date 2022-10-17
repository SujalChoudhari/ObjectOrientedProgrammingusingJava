package com.sujalchoudhari;

interface UI{	
	default void getInput() {
		// code goes here ...
	}
	public void getData();
	public void showStats();
}


interface Electronics{
	public void start(); 
	public void run();
}

abstract class Hardware{
	public void bootUp() {
		// bootUp code is same for all Hardware
	}
	
	public abstract void checkComponents(); // Components depends upon the hardware.
	
}

class Mobile extends Hardware implements Electronics,UI{
	
	
	// Electronics
	public void start() {
		// code goes here ...
	}
	public void run() {
		// code goes here ...
	}
	
	
	// UI - getInput is already Implemented in UI as a default method
	public void getData() {
		// code goes here ...
	}
	public void showStats() {
		// code goes here ...
	}
	
	
	// Hardware
	public void checkComponents() {
		// code goes here ...
	}
	
}


public class NOTES_17_OOPS_Interfaces {

	public static void main(String[] args) {
		// An Abstract class can/must have one or more Abstract Methods.
		// An Interface should/must have all Abstract Methods.
		// You cannot modify the properties of Interfaces
		// Privates are allowed in Interfaces
		@SuppressWarnings("unused")
		Mobile m = new Mobile();
	}

}
