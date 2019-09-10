package com.chanpreet.abstractClass;

public class Main extends AbstractClass {

	public static void main(String[] args) {
		AbstractClass obj=new Main();		//dynamic binding
		obj.function1();
		obj.function2();
	}

	@Override
	void function1() {
		System.out.println("Function1:Implementation of abstract function in child class");
	}
	

}
