package com.sujalchoudhari;

class Vehical{
	int tyres;
	int doors;
	Vehical(){
		System.out.println("New Vehical is Created");
	}
	
	void start() {
		System.out.println("Vehical Started");
	}
	
}


class Car extends Vehical {
	Car(){
		super();
		System.out.println("New Car is Created");
		this.tyres = 4;
		this.doors = 4;
	}
	
	@Override
	void start(){
		 super.start();
		 System.out.println("But of Car");
	}
}



public class NOTES_14_OOPS_Inheritance {

	public static void main(String[] args) {
		Vehical vc = new Vehical();
		Car car = new Car();
		
		vc.start();
		car.start();

	}

}
