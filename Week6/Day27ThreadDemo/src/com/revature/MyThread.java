package com.revature;

//Thread created by extending Thread class
public class MyThread extends Thread {

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		System.out.println("Thread is called!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread obj = new MyThread();
		obj.start();
		System.out.println("Thread ID :" + obj.getId());
		System.out.println("Thread Name :" + obj.getName());
//		obj.setPriority(MIN_PRIORITY);
		System.out.println("Thread Priority :" + obj.getPriority());

	}

}
