package com.sujalchoudhari;

interface Interface{
	void meth1();
	void meth2();
}

interface Interface2 extends Interface{
	default void meth3() {
		System.out.println("Meth 3");
	}
	default void meth4() {
		System.out.println("Meth 4");
	}
}

class MySample implements Interface2{
	public void meth1() {
		System.out.println("Meth 1");
	}
	public void meth2() {
		System.out.println("Meth 2");
	}
}

public class NOTES_18_OOPS_InheritanceInInterfaces {

	public static void main(String[] args) {
		MySample s = new MySample();
		s.meth1(); s.meth2(); s.meth3(); s.meth4();
	}

}
