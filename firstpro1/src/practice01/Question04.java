package practice01;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
//		* ask to user how many cups of tea you drink daily and how many spoons of sugar
//        * one spoon sugar is 1.7 gr
//        * print on the console amount of sugar used annually
//        *

   Scanner scan = new Scanner(System.in);
   System.out.println("How many cups of tea you drink daily?...");
	double tea= scan.nextDouble();
	System.out.println("How many spoons sugar you use for one cup of tea?");
	double sugar= scan.nextDouble();
	System.out.println("The amount of sugar used annually: " + tea*sugar*365/1000 + "kg");
	
		
		
		
	}

}
