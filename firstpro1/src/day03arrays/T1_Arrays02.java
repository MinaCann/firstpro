package day03arrays;

import java.util.Arrays;


public class T1_Arrays02 {

	public static void main(String[] args) {
		
		int arr[]= {1, 2, 3};
		
		int temp= arr[0];
		
		arr[0]= arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		
		System.out.println(Arrays.toString(arr));
		
		int arr2[]= {1,3,5,7,9,4};
		
		temp=arr2[0];
		
		for(int i=0; i<arr2.length-1; i++) {
			arr2[i]=arr2[i+1];
			
		}
		System.out.println(Arrays.toString(arr2));
		
		arr2[arr2.length-1]=temp;
		
		System.out.println(Arrays.toString(arr2));
	}

}
