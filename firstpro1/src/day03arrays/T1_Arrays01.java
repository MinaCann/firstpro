package day03arrays;

import java.util.Arrays;

public class T1_Arrays01 {

	
	public static void main(String[] args) {
		String arr1[]= new String[4];
		arr1[0]="Ali";
		arr1[1]="Veli";
		arr1[2]="Ayse";
		arr1[3]="Fatma";
		
		System.out.println(Arrays.toString(arr1));
		System.out.println("=========");
		System.out.println(arr1[1]);
 
		String arr2[]= {"Ali", "Veli", "Ayse", "Fatma"};
		
		arr1[1]="Hasan";
		arr1[0]="Hakan";
		arr2[3]="Mumine";
		System.out.println(arr2[3]);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i] +" ");
		}
		System.out.println("==========");
		int arr3[]=new int[9];
		System.out.println(Arrays.toString(arr3));
		
		
		arr3[5]= 7;
		System.out.println(Arrays.toString(arr3));
		arr3= new int[15];
		System.out.println(Arrays.toString(arr3));
		
		}

}
