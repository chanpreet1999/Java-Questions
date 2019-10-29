package com.chanpreet.Exceptions;

import java.util.Scanner;

public class Score {
	void input() throws Exception{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter a Score: ");
			int score =sc.nextInt();
			if(score<30) {
				throw new CustomExceptionClass();
			}
			else{
				throw new RuntimeException("This is a pre-defined exception!");
			}
		}catch(CustomExceptionClass e){
			e.errorFunction();
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("this block is always executed");
		}
		
	}
}
