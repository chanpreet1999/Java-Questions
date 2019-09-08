package com.chanpreet;

import java.util.Scanner;

public class BiggestOf3Int {

	public static void main(String[] args) {
		int a,b,c;
		try{
			System.out.println("Find biggest of 3 integers");
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter the 3 integers:");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			sc.close();
			int max= a>b ? (a>c ? a:c):(b>c? b:c);
			System.out.println("Maximum of "+a+","+b+" and "+c+" is:"+max);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
