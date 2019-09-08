package com.chanpreet;

import java.util.Scanner;

public class Fibonacci {
	static int f=0,s=1,t;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Fibonacci Series\n");
		System.out.println("Enter N:");
		int n=sc.nextInt();
		sc.close();
		System.out.println("Without Recursion");
		fiboWithoutRec(n);
		System.out.println("\nWith Recursion");
		System.out.print(f+" "+s);
		fiboUsingRec(n-2);
	}

	private static void fiboUsingRec(int n) {
		 if(n>0){    
	         t = f + s;    
	         f =s;    
	         s = t; 
	         System.out.print(" "+t);   
	          fiboUsingRec(n-1);    
	     }    
	}

	private static void fiboWithoutRec(int n) {
		
		int first=0,second=1,third;
		
		System.out.print(first+" "+second);
		for(int i=2;i<n;i++){
			third=first+second;
			System.out.print(" "+third);
			first=second;
			second=third;
		}
	}

}
