package com.chanpreet;

public class ConstructorOverloading {

	private String a;
	
	
	
	public ConstructorOverloading(String a) {
		this.a = a;
		System.out.println(this.a);
		
	}
	


	public ConstructorOverloading() {
		System.out.println("Default Constructor");
	}



	public static void main(String[] args) {
		
		System.out.println("Constructor Overloading");
		ConstructorOverloading obj1=new ConstructorOverloading();
		ConstructorOverloading obj2=new ConstructorOverloading("Parameterised Constructor");
	}

}
