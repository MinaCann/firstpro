package day02ififelsenestedif;

import java.util.Scanner;

public class T1_If01 {

	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number of the rectangle");
		 int side1=scan.nextInt();
		 int side2=scan.nextInt();
		 
		 if (side1==side2) {
			System.out.println("It is not rectangle");
		}
		if(side1!= side2) {
			System.out.println("It is a rectangle");
		}
}
}