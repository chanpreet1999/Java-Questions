package com.chanpreet.nestedClass;

public class NestedClass {
	
	 	int a=10;
	 	private String str="Something!";
	 	static double b=100.00;
	 	void disp(){
 			System.out.println("\n\nOuter class display");
 			System.out.println("a:"+a+" b:"+b+" string:"+str);
 		}
	 	class InnerClass{
	 		int c=1;
	 		void disp(){
	 			System.out.println("\nInner class display");
	 			System.out.println("a:"+a+" b:"+b+" c:"+c+" string:"+str);
	 		}
	 	}
	 		
}
