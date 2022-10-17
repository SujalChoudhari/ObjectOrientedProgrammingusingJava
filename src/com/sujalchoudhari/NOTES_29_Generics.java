package com.sujalchoudhari;

import java.util.ArrayList;

class Generic<Type1,Type2>{
	public Type1 thing;
	public Type2 thing2;
	
	public Generic(Type1 a,Type2 b) {
		thing = a;
		thing2 = b;
	}
	
	public <Type> Type getSomething(Type t){
		return t;
	}
	
}

public class NOTES_29_Generics {

	public static void main(String[] args) {
		
		// <Integer> is s Generic
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		
		Generic<Integer,String> g = new Generic<>(1,"A");
		
//		System.out.print(g.thing2 + g.thing);
		
		System.out.println(g.getSomething(10));

	}

}
