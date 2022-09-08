package studio1;

import java.util.Scanner;

public class LeapYear {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("What year?");
		int x = in.nextInt();
		
		boolean year = x%4 == 0 && x % 100 != 0;
		System.out.println(x+" is a leap year: " + year);
	}
}
