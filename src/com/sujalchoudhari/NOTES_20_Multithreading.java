package com.sujalchoudhari;

// Using Thread Class
class NewThread1 extends Thread {

	public NewThread1(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(this.getName());
		}
	}
}

// Using Runnable Interface
//class NewThread2 implements Runnable {
//	public void run() {
//		while (true) {
//			System.out.println("RunnableThread is running  ----->  2");
//		}
//		System.out.println("RunnableThread is running  ----->  2");
//	}
//}

public class NOTES_20_Multithreading {

	public static void main(String[] args) {
		// Concurrency vs Parallelism
		// Concurrent => One task at a time. (But doing multiple tasks)
		// Parallelism => Multiple tasks are taken care of simultaneously
		// Thread t2 = new Thread(runnable, "Name2");
		// NewThread2 runnable = new NewThread2();
		// t2.start();

		NewThread1 t1 = new NewThread1("Name1");
		NewThread1 t3 = new NewThread1("Name3");
		NewThread1 t4 = new NewThread1("Name4 (important)");
		NewThread1 t5 = new NewThread1("Name5 (most important)");
		NewThread1 t6 = new NewThread1("Name6");
		NewThread1 t7 = new NewThread1("Name7");
		NewThread1 t8 = new NewThread1("Name8");
		t5.setPriority(7);
		t4.setPriority(6);

		t5.start();
		t1.start();
		t3.start();
		t4.start();
		try {
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t6.start();
		t7.start();
		t8.start();

	}

}
