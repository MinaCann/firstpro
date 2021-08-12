package javapractice01;

import java.util.Arrays;
import java.util.Random;

public class CodingInJavaIsFun04 {

	
//8. Write a method that generates an single dimensional Array that consists of x numbers random numbers between 1 and 100.
//Method will accept int x as an argument.
		
		static int[] arrayGenerater (int num) {
			
			int[]myArray = new int[num];
			
			for(int i =0; i<myArray.length; i++)
			  myArray[i] = new Random().nextInt(100);
			
			return myArray;
		}
		
		
		public static void main(String[] codingInJavaIsFun) {
			System.out.println(Arrays.toString(arrayGenerater(10)));
	}

}
