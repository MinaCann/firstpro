package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
//		* Ask the user for an integer less than 100
//        A method that returns to the user whether
//        it is in a predefined array or not. write
//      *
//      * Array={3,5,21,32,34,45,56,57,76,87,95}
//      *
//      * Input : 5 Output: The number you entered is in the Array
//      * Input : 15 Output: The number you entered is not in the Array
//      *
		
		int arr[] = {3,5,21,32,34,45,56,57,76,87,95};
//		inarr[arr];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num= scan.nextInt();
		int flag=0;
		
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]) {
		System.out.println("your number is in the array");
			flag++;
			break;	
			}	
		}
		if(flag==0) {
			System.out.println("number is not in the array");
		}
		
	}

}
