package practice01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
//	//Ask user to enter a character and print the ASCII value of that character	
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please eneter a character...");
//		char x = scan.next().charAt(0);
//		int ascii = 'a';
//		System.out.println("ASCII value : " + ascii);
//		
		
//		 create 3 char variables then print A L I on the console using
//	        * String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
//		String pickname = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		 char a =pickname.charAt(0);
//		 char b = pickname.charAt(11);
//		 char c = pickname.charAt(8);
//		
//		System.out.println(a+" "+b+" "+c);
		
//		0)Ask user to enter two integers
//    1)Swap the integers
//    2)EXAMPLE:
//     INPUT: a= 3
//            b= 5
//     OUTPUT: a= 5
//             b= 3
//		
		
//		Scanner scan = new Scanner(System.in);
//		int a=3;
//		int b=5;
//		int temp=0;
//		temp=b;
//		b=a;
//		a=temp;
//		System.out.println("a: "+a+ " b: " +b);
//		
		
		
//		System.out.println("Before swap a: "+ a);
//				System.out.println("Before swap b:" + b);
//			temp=b;
//			b=a;
//			a=temp;
//			System.out.println("After swap a: " + a );
//			System.out.println("After swap b: " + b );	
		
	//	ask user to enter 8 primitive data and print on the consle
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 8 Primitive data type...");
		
		System.out.println("please enter int number ");
		int num = scan.nextInt();
	   System.out.println("user enter= " +num);
	   
	   System.out.println("please enter byte number");
	   byte num1= scan.nextByte();
	   System.out.println("user enter= " +num1);
	   
	   System.out.println("please enter float number");
		 float num2=scan.nextFloat();
		System.out.println("user enter= " + num2);
		
		System.out.println("please enter short number");
		short num3 = scan.nextShort();
		System.out.println("user enter= " +num3);
		
		System.out.println("please enter long number");
		long num4 = scan.nextLong();
		System.out.println("user enter= " +num4);
		
		System.out.println("please enter double number");
		double num5 = scan.nextDouble();
		System.out.println("user enter= " +num5);
		
		System.out.println("please enter char number");
		char word = scan.next().charAt(0);
		System.out.println("user enter= " +word);
	
		System.out.println("please enter boolean");
		boolean b =scan.nextBoolean();
		System.out.println("user enter= " +b);
	}

}
