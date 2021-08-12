package loop01;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsWhileLoopsDoWhile {

	public static void main(String[] args) {
		
//		
//		* Ask the user for an integer less than 100
//        A method that returns to the user whether
//        it is in a predefined array or not. write
//      *
//      * Array={3,5,21,32,34,45,56,57,76,87,95}
//      *
//      * Input : 5 Output: The number you entered is in the Array
//      * Input : 15 Output: The number you entered is not in the Array
//      *
//      *	
//		
		
		int arr[]={3,5,21,32,34,45,56,57,76,87,95};
		//inArray(Array);
		
			
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter an integer which is less than 100...");
		
		int number=scan.nextInt();
	
		int flag=0;
		for(int i=0; i<arr.length;i++) {
			if(number==arr[i]) {
				System.out.println("The number you entered is in the Array");
				flag++;
				break;
				
			}
		}
		if(flag==0)	{
			System.out.println("The number you entered is not in the Array");
		}
		
		
		
		
	}

}
