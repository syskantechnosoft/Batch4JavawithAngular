package com.revature.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		int a =5;
		int b= 0;
		//handling exception using try/catch block
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//checked or compile-time exception
		InputStream is = new FileInputStream(new File("e:/test.txt"));
		is.close();
		System.out.println("program ends here!!!");
	}

}
