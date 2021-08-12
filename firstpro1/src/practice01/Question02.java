package practice01;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
//		* ask user to enter a integer number
//        * find the sum of digitnumber
//        * example 345=12
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer number...");
		int num = scan.nextInt();
		int sum=0;
		
	    while (num>0) {
	    	sum+=num%10;
	    	num=num/10;
	    	System.out.println("Sum of the digit: "+ sum);
	    }
	}

}
