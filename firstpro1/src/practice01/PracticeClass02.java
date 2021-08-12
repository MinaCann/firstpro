package practice01;

import java.util.Scanner;

public class PracticeClass02 {

	public static void main(String[] args) {
//		Scanner scan =new Scanner(System.in);
//		System.out.println("please enter 2 integer number for rectangle");
//      int a = scan.nextInt();
//      int b = scan.nextInt();
//      
//       String result= a==b ? ("square") : ("rectangle");
//        System.out.println(result);
//        
	Scanner scan =new Scanner(System.in);
	System.out.println("please enter 3 digit number");
			int num = scan.nextInt();
			String result = num>99 && num<1000 ? ("3 digit number"): ("not 3 digit number");
	        System.out.println(result);
	
	}

}
