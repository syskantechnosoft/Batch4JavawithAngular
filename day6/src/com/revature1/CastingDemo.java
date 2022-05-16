package com.revature1;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isActive = true;
		
		byte small= 120;
		
		char test= 'g';
		
		short small1 = 456;
		
		int medium = 87674;
		
		float decimal = 9834.34534f;
		
		long mobile = 9889098978l;
		
		double biggerDecimal = 9834.435345;
		System.out.println(medium);
		medium = small; //( Smaller to bigger -- implicit type casting)
		
		small = (byte) medium; //(Bigger to Smaller)   -- Explicit type casting
		
		
		System.out.println(small);
	}

}
