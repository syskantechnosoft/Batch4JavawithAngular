package com.revature.exception;

public class TryCatch1 {

	public static void main(String[] args) {
		int a = 25;
		int b = 0;
		int c[] = { 4, 5, 6 };
		int d[] = new int[] { 2, 3, 5 };
		try {
			System.out.println(c[2]);
			System.out.println(a / b);
		} catch (ArrayIndexOutOfBoundsException aie) {
			// TODO: handle exception
			System.out.println(aie.getMessage());
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println(ae.getMessage());
		} finally {
			System.out.println("This is finally block");
		}

		System.out.println("program ends here!!!");

	}

}
