package com.chanpreet;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1, i = 1, n;
		System.out.println("Find factorial of a no.");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter value of n:");
		n = sc.nextInt();
		sc.close();
		try {
			if (n < 0)
				throw new Exception("Factorial of negative numbers is not defined");

			else if (n == 0)
				System.out.println(1);
			else {
				for (i = 1; i <= n; i++)
					fact = fact * i;
				System.out.println("Factorial of " + n + " is :" + fact);

				}
			} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
