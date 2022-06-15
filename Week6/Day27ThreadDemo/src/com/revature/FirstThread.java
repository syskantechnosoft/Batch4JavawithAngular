package com.revature;

public class FirstThread implements Runnable {

	public static void main(String[] args) {

		FirstThread t2 = new FirstThread();
//		System.out.println(t1.getState());
		Thread t1 = new Thread(t2);
		System.out.println(t1.getState());

		FirstThread t3 = new FirstThread();
		Thread t4 = new Thread(t3);
		System.out.println(t4.getState());
		System.out.println("t1 name:" + t1.getName());
//		System.out.println("t2 name:" + t2.getName());
//		System.out.println("t3 name:" + t3.getName());
		System.out.println("t4 name:" + t4.getName());

		System.out.println(t1.getState());
		t1.start();
		t2.run();
		t3.run();
		t4.start();
		System.out.println(t1.getState());
		System.out.println(t4.getState());
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " is Running");
	}

}
