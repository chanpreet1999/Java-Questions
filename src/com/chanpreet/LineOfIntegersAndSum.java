package com.chanpreet;

import java.util.Scanner;

public class LineOfIntegersAndSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int sum = 0;
		
		System.out.println("Enter a list fo integers display them and display their sum\n");
		System.out.print("Enter no of elements: ");
		int n=sc.nextInt();
		
		int list[] = new int[n];
		System.out.print("Enter the list: ");
		for(int i = 0; i < n; i++) 
			list[i] =sc.nextInt();
		
		sc.close();
		
		System.out.print("The List is: ");
		for(int i : list){
			System.out.print(i+" ");
			sum += i;
		}
		System.out.println("\nSum of all elements: "+sum);
	}

}
