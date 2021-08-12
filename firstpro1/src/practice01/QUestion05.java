package practice01;

import java.util.Scanner;

public class QUestion05 {

	public static void main(String[] args) {
//		* ask the user for an edge and height of an equilateral triangle
//        * find the area and perimeter of the triangle
//        * print on the console
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter edge of the triangle");
		double x = scan.nextDouble();
		System.out.println("Please enter height of the triangle");
        double y = scan.nextDouble();
        System.out.println("Area of the triangle: "+ (x*y/2));
        System.out.println("Perimeter of the triangle: " + (x*3));
	}

}
