package day01scanner;

import java.util.Scanner;

public class T2_Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name...");
		char firstWord= scan.next().charAt(3);
		System.out.println("First initual of your name : " +firstWord);
		

		scan.close();
	}

}
