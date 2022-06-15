package com.revature;

//Thread created using Runnable interface
public class AnotherThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnotherThread obj = new AnotherThread();
		obj.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running!!!");
	}

}
