package com.chanpreet.superKeyword;

public class DerivedClass extends SuperClass {

	public String var = "Derived Class Variable";

	public static void main(String[] args) {

		System.out.println("Super Keyword\n");
		DerivedClass obj = new DerivedClass();
		obj.disp();

	}

	public DerivedClass() {
		super(); // call to constructor of SuperClass
		System.out.println("Constructor of DerivedClass");
		System.out.println("\nUsing varables\n"+var + " and " + super.var);
	}

	public void func() {
		System.out.println("Function of Derived/Child Class");
	}

	private void disp() {
		System.out.println("\nCall to Functions");
		func();
		super.func();
	}

	
}
