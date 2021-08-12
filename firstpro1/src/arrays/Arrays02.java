package arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4};
		int arr1[]= {1, 2, 3, 4};
		System.out.println(Arrays.equals(arr1, arr));
		
		int arr2[]= {3, 5, 7, 9};
		int arr3[]= {5, 3, 9, 7};
		System.out.println(Arrays.equals(arr2, arr3));
		
		int arr4[]= {13, 25, 7, 9, 6, 11};
		int arr5[]= {25, 13, 9, 7, 11, 6};
		Arrays.sort(arr4);
		Arrays.sort(arr5);
		System.out.println(Arrays.equals(arr4, arr5));
		
	//Find the sum of all elements in the multi dimensional array
		
		int brr[][]= {{1,2}, {3, 4}, {5, 6,7}};
		int sum=0;
		for(int i=0;i<brr.length;i++) {
		
		sum=sum+brr[i].length;
		
		}System.out.println(Arrays.toString(brr[0]));	
		
		//int brr1[][]=new int [3][2];
		
//		System.out.println(Arrays.toString(brr[0]));
//		System.out.println(Arrays.toString(brr[2]));
//		System.out.println(Arrays.toString(brr1[0]));
		System.out.println(Arrays.deepToString(brr));
		
		
		int brr1[][]= {{1,2}, {3, 4}, {5, 6,7}};
		
		int A=0;
		int M=1;
		for(int i=0;i<brr1.length;i++) {
			for(int x=0;x<brr[i].length;x++) {
				A=A+brr1[i][x];
				M=M*brr1[i][x];
			}
		
		}
		System.out.println(A);
		System.out.println(M);
				}

}
