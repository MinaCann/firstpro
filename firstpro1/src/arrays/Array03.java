package arrays;

import java.util.Arrays;

public class Array03 {

	//public static void main(String[] args) {
		// Given an array of integers, find the one that appears an odd number of times.
				//There will always be only one integer that appears an odd number of times.
				//System.out.println(findIt(new int[] {2,4,6,8,4,5,2,4,8,6,5}));
				//System.out.println(numapp(new int[] {2,4,6,8,4,5,2,4,8,6,5},8));
				//System.out.println(findIt1(new int[] {2,4,6,8,4,5,2,4,8,6,5}));
//	}
     
//		for(int i=0; i<a.length;i++) {
//			if(numapp(a, a[i]%2!=0){
	//			odd=a[i];
	//		}
	//	}return odd;
	//}
	
	
	//Write a return method to reverse number.
    //Input : 12345
   //Output : 54321
	public static void main(String[] args) {
		String name[]= {"12345"};
		String x="";
		String arr[]=x.split("");
		
		for(int i=name.length-1;i>0;i--) {
			x=x+name[i];
		}
		 System.out.println(x);
}
}