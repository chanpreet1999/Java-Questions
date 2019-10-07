package com.chanpreet.AbstractShapeProg;

public class Main {

	public static void main(String[] args) {
		System.out.println("Create abstract class names Shape...\n");
		
		Triangle theTriangle = new Triangle();
		Rectangle theRectangle = new Rectangle();
		Trapezoid theTrapezoid = new Trapezoid();
		Hexagon theHexagon = new Hexagon();
		
		System.out.println("No. of sides of Triangle are : "+theTriangle.numberOfSides());
		System.out.println("No. of sides of Rectangle are : "+theRectangle.numberOfSides());
		System.out.println("No. of sides of Trapezoid are : "+theTrapezoid.numberOfSides());
		System.out.println("No. of sides of Hexagon are : "+theHexagon.numberOfSides());
	}

}
