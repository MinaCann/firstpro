package javapractice01;

public class CodingInJavaIsFun {


		//1. Write a method that returns the sum of numbers starting with 1 to the number passed into the method.

		
		static int sumOfNumber(int num) {
			int sum =0;
			for(int i=1; i<=num; i++)
				sum+=i;
			
			return sum;
		}
		
				
		
			
		public static void main (String[] codingInJavaIsFun) {
			System.out.println(sumOfNumber(15));
		}
		
	}


