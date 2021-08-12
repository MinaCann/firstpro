package practice01;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
//		 ask the user about one side of the square
//         * find the area and perimeter of the square
//         * print on the console

		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter one side of the rectangle");
		int a = scan.nextInt();
		System.out.println("Please enter other side of the rectangle");
		int b = scan.nextInt();
		System.out.println("Perimeter of the rectangle: " +(2*(a+b)));
		System.out.println("Area of the rectangle: " + (a*b));
		
		
	}

}
