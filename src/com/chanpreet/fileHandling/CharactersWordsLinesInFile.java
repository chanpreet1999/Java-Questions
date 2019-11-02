package com.chanpreet.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharactersWordsLinesInFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		char ch[];
		String str;
		int cc=0,cw=0,cl=0;
		Scanner sc1 = new Scanner(new File("E:\\File1.txt"));//save file in e(or any other) drive directly
		System.out.print("\nReading File Character by Character");
		while(sc1.hasNext()){
			ch = sc1.next().toCharArray();
			cc=cc+ch.length;
		}
		System.out.println("\nTotal Number Of Characters: "+cc);
		sc1.close();
		
		System.out.print("\nReading File Word by Word");
		Scanner sc2 = new Scanner(new File("E:\\File1.txt"));
		while(sc2.hasNext()){
			str = sc2.next();
			cw+=1;
		}
		System.out.println("\nTotal Number Of Words: "+cw);
		sc2.close();

		System.out.print("\nReading Line Word by Line");
		Scanner sc3 = new Scanner(new File("E:\\File1.txt"));
		while(sc3.hasNext()){
			str = sc3.nextLine();
			cl+=1;
		}
		System.out.println("\nTotal Number Of Lines: "+cl);
		sc3.close();
		
	}
}
