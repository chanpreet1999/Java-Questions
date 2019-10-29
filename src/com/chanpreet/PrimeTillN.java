package com.chanpreet;

import java.util.Scanner;

public class PrimeTillN {

	public static void main(String[] args) {
		
		int n;
		boolean flag=true;
		System.out.println("Find Prime nos till N");
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter N:");
		n=sc.nextInt();
		sc.close();
		System.out.print("prime nos till "+ n +" are: ");
		for(int i=2;i<=n;i++){
			flag=true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(i+" ");
		}
	}

}
