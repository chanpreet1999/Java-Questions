package com.chanpreet.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharactersWordsLinesInFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		char ch[];
		String str;
		
		Scanner sc1 = new Scanner(new File("E:\\Chan\\Java-Practical-File\\JavaPracticalFile\\src\\com\\chanpreet\\fileHandling\\File1.txt"));
		System.out.println("\nReading File Character by Character");
		while(sc1.hasNext()){
			ch = sc1.next().toCharArray();
			display(ch);
		}
		sc1.close();
		
		System.out.println("\nReading File Word by Word");
		Scanner sc2 = new Scanner(new File("E:\\Chan\\Java-Practical-File\\JavaPracticalFile\\src\\com\\chanpreet\\fileHandling\\File1.txt"));
		while(sc2.hasNext()){
			str = sc2.next();
			System.out.println(str+ " ");
		}
		sc2.close();

		System.out.println("\nReading Line Word by Line");
		Scanner sc3 = new Scanner(new File("E:\\Chan\\Java-Practical-File\\JavaPracticalFile\\src\\com\\chanpreet\\fileHandling\\File1.txt"));
		while(sc3.hasNext()){
			str = sc3.nextLine();
			System.out.println(str+ " ");
		}
		sc3.close();
		
	}

	
	private static void display(char[] ch) {
		for(char c : ch){
			System.out.println(c);
		}
	}

}
