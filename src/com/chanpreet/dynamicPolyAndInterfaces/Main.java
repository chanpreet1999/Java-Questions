package com.chanpreet.dynamicPolyAndInterfaces;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Program to depict Dynamic Polymorphism and Interfaces\n");
		
		ClassA obj = new ClassB();	//dynamic binding
		obj.function1();
		obj.function2();
		
	}

}
