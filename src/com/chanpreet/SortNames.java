package com.chanpreet;

import java.util.Arrays;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		
		System.out.println("Sort a list of Names\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of names: ");
		int n = sc.nextInt();
		sc.nextLine();
		String names[] = new String[n];
		
		System.out.println("Enter the names");
		for(int i = 0; i < n; i++) 
			names[i] = sc.nextLine();
		sc.close();
		
		Arrays.sort(names);
		
		System.out.println("Sorted List is : ");
		for(String i: names)
			System.out.print(i+" ");
		
	}

}
