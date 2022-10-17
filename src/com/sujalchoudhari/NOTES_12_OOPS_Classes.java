package com.sujalchoudhari;

class Employee{
	public int id;
	protected String name;
	
	// constructors
	Employee(){
		id = 0;
		name = "Player1";
	}
	
	// constructor overloading
	Employee(int _id,String _name){
		id = _id;
		name = _name;
	}
}


public class NOTES_12_OOPS_Classes {
	public static void main(String[] args) {
		Employee sujal = new Employee(10,"Sujal");
		System.out.println(sujal.id);
		System.out.println(sujal.name);
	}
}
