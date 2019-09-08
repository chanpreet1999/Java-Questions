package com.chanpreet.nestedClass;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Demonstrate Nested Classes");
		NestedClass obj1=new NestedClass();
		obj1.disp();
		NestedClass.InnerClass obj2= obj1.new InnerClass();
		obj2.disp();
	}

}
