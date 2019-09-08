package com.chanpreet;

import java.util.Scanner;

public class Student {

	public int roll;
	public String name;
	public double[] marks;
	public double avg;
	public char grade;
	public double percent;
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of students");
		int n=sc.nextInt();
		Student[] obj=new Student[n];
		for(int i=0;i<obj.length;i++) {
			obj[i]=new Student();
			System.out.println("Enter details of Student"+(i+1));
			obj[i].input();
			obj[i].calc();
			
		}
		for(int i=0;i<obj.length;i++) {
		
			System.out.println("\nDetails of Student "+(i+1));
			System.out.println("________________________");
			obj[i].disp();
		}
		
		System.out.println("Success");
		//sc.close();
		
	}

	private void disp() {
		
		System.out.println("Name:"+name);
		System.out.println("Roll No:"+roll);
		System.out.println("Average Marks:"+avg);
		System.out.println("Percentage"+percent);
		System.out.println("Grade:"+grade);
		
	}

	private void calc() {
		
		for(int i=0;i<marks.length;i++) {
			avg+=marks[i];
		}
		double maxMarks=marks.length*100;
		percent=(avg/maxMarks)*100;
		avg/=marks.length;
		if(percent>90)
			grade='O';
		else if(percent>80)
			grade='A';
		else if(percent>70)
			grade='B';
		else if(percent>60)
			grade='C';
		else if(percent>50)
			grade='D';
		else 
			grade='E';
		
	}

	private  void input(){	
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Roll No. :");
		roll=sc.nextInt();
		sc.nextLine();
		System.out.print("Name:");
		name=sc.nextLine();
		
		marks=new double[5];
		for(int i=0;i<5;i++) {
		
			System.out.print("Marks in subject "+(i+1));
			marks[i]=sc.nextDouble();		
			}
		
	}
	
	
}
