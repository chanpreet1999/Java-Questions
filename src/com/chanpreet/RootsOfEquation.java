package com.chanpreet;

import java.util.Scanner;

public class RootsOfEquation {

	public static void main(String[] args) {
		System.out.println("Roots of Equation\n");
		double a,b,c,d;
		try{
			System.out.println("Enter values of a,b and c:");
			Scanner sc=new Scanner(System.in);
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=sc.nextDouble();
			sc.close();
			d= Math.pow(b, 2)-4*a*c;
			if(d<0)
				throw new Exception("There are no real roots for the given equation");
			else{
				double root1= (-b+Math.sqrt(d))/(2*a);
				double root2= (-b-Math.sqrt(d))/(2*a);
				System.out.println("Roots of the equation are:"+root1+" "+root2);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
