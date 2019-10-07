package com.chanpreet;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String input){
		
		int i ,j ,len = input.length();
		
		input = input.toLowerCase();
		for(i = 0 , j=len-1; i <= len/2; i++, j--) {
			if(input.charAt(i) != input.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println("Check if a given string is a Palindrome or not\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String input = sc.nextLine();
		sc.close();
		if(isPalindrome(input)){
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	}

}
