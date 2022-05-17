package com.revature;

public class SwitchCase {

	public static void main(String[] args) {
		int a = 675;
		int reverse = 0;
		while (a > 0) {
			reverse = (reverse * 10) + (a % 10);
			a /= 10;
		}
		while (reverse > 0) {
			int temp = reverse % 10;
			switch (temp) {
			case 0:
				System.out.print(" Zero ");
				break;
			case 1:
				System.out.print(" One ");
				break;
			case 2:
				System.out.print(" Two ");
				break;
			case 3:
				System.out.print(" Three ");
				break;
			case 4:
				System.out.print(" Four ");
				break;
			case 5:
				System.out.print(" Five ");
				break;
			case 6:
				System.out.print(" Six ");
				break;
			case 7:
				System.out.print(" Seven ");
				break;
			case 8:
				System.out.print(" Eight ");
				break;
			case 9:
				System.out.print(" Nine ");
				break;
			default:
				break;
			}
			reverse /= 10;
		}
	}
}
