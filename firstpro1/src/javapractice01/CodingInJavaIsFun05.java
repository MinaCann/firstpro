package javapractice01;

import java.util.Arrays;
import java.util.Scanner;

public class CodingInJavaIsFun05 {

	public static void main(String[] args) {
		//Print even numbers from 20 to 0 but do not use decrement (i--).

		//OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
		
//		int i=20;
//		while(i<=100) {
//			if(i%2==0)
//			System.out.print(i +" ");
//			i++;
//			
			
//			char ch='a';
//			while(ch<='z') {
//				System.out.print(ch + " ");
//				ch++;
//			
		
//		Write java code checking the number is Perfect number or not. 
//    * Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number. 
//      Input :6
//		Output:6 is Perfect Number
//		Input :7
//		Output:7 is not Perfect Number

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a number...");
//	    int num = scan.nextInt();
//	    
//	    int count = 0;
//	    
//	    for(int i=num; i>0;i--) {
//	    	if(num%i==0) {
//	    		count++;
//	    		
//	    	}
//	    }
//	    	if (count>=3) {
//	    		System.out.println(num+ " is Perfect Number");
//	    	}else {
//	    		System.out.println(num+ " is not Perfect Number");
//	    	
		
		
		String str = "Javaisalsoeasy"; 
	    String[] arr = str.split("");
	    String duplicate = "";

	    for(int i=0; i<arr.length; i++){
	        for(int j=arr.length-1; j>i; j--){
	            if(arr[i].equals(arr[j])){
	                if(!(duplicate.contains(arr[i]))) {
		            		duplicate+=arr[i];
		            	}
	            }
	        }
	    }
	    String brr[] = duplicate.split("");
	    System.out.println(Arrays.toString(brr));
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
			}
		
		
		
		
		
	


