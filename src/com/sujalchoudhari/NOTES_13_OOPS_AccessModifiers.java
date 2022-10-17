package com.sujalchoudhari;

class Sample {
	public byte publicProperty;
	@SuppressWarnings("unused")
	private byte m_PrivateProperty;
	
	public void setPrivate(int a) {
		m_PrivateProperty =(byte) a;
		//this.m_PrivateProperty = (byte)a;
	}
}


public class NOTES_13_OOPS_AccessModifiers {

	public static void main(String[] args) {
		/**
		 * Access Modifiers:
		 * 
		 * Public
		 * Private
		 * Default
		 * Protected
		 * 
		 * Getters and Setters:
		 * Getters : Access the properties
		 * Setters : Mutate properties
		 * 
		 */
		
		Sample sample = new Sample();
		sample.publicProperty = 10;
		//sample.privateProperty = 1; //cannot access it here
		sample.setPrivate(1); // can access using setters and getters
		System.out.println(sample.publicProperty);
		
	}

}
