package com.revature.exception;

public class TryCatch2 {
	public static void main(String[] args) {
		int age=25;
		int salary = 35000;
		String roles[] = {"Admin","User", "Doctor", "Nurse", "Patients"};
		try {
		System.out.println(roles[4]);
		System.out.println(salary/0);
		} catch (ArrayIndexOutOfBoundsException |ArithmeticException  e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} 
		
		System.out.println("program ends here!!");
	}
}
