package javapractice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class JavaIsFun02 {

	// Write a method that accepts an array and returns true if the sum of all 3's in the array is exactly 9.
	//EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false
	
	static boolean sumOf3(int[] arr) {
		
		int count=0;
		for(int num: arr) {
			if(num== 3)
				count++;
		
		}
		return count == 3;
	}
	
	
	// 7. Write a method that checks to see if the words u pass is Anagram. EX: read and dear  --> true

	 static boolean isAnagram(String str1, String str2) {
		 
		 //toCharArray
		 //split()
		 
		 //String[] arr1 = str1.split(regex:"");
		 char[] arr1 = str1.toCharArray();
		 //String[] arr2 = str2.split(regex:"");
		 char[] arr2 = str2.toCharArray();
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
	
	
	      return Arrays.equals(arr1,  arr2);
	}
	 
	 
	 
	// 9. Write a method that accepts an Array of integers and returns the max. and 
	 
	 static String findMaxs(int[] arr) {
		 int max = Integer.MIN_VALUE;
		 int secondMax = Integer.MIN_VALUE;
		 //Arrays.sort(arr);
		 //System.out.println(Arrays.toString(arr));
		 for(int num : arr) {        // max = 1 and secondMax =0
			 if(num>max) {           //num=3
				 secondMax = max;
				 max = num;          //max= 3 and secondMax = max = 1
			 }else if(num> secondMax)
				 secondMax = num;
		 }
		 return "max is = " + max + " secondMax is " + secondMax;
	 }
	 
	 
	 
	 
	 //10. Write a method that accepts an Array of integers and returns the second max.
	// 11. Write a method that accepts an Array of ints returns the sorted Array in ascending order.Do not use the sort method.

	 static int[] sortedArray(int[] arr) {
		 
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = i + 1;j < arr.length; j++) {
				 if(arr[i] > arr[j]) {
					 int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
		 return arr;
	 }
	 
	 
	 
	 // 14. Write a method that accepts an Array and returns the number/s that are not repeated in an ArrayList.
	 //Method returns the numbers in aN ArrayList. EX: arr = {1,1,2,2,3,3,4,5}  ---> [4,5]
	 
	 
	 static ArrayList<Integer> findUnique(int[] arr){
		 
		 ArrayList<Integer> al = new ArrayList<>();
		 
		 for(int num: arr) {
			 int count = 0;
			 for(int num2 : arr) {
				 if(num == num2)
					 count++;
	 }
			 if(count == 1 && ! al.contains(num))
				 al.add(num);
		 }
		 return al;
	 }
	 
	// 16. Write a method that takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord.
	 //Method removes the targetWord from ArrayList.EX :ArrayList("hi","hey","hi","yo"));  ----> removeAll(wordList,"hi"); --->["hey","yo"].
 
	 static ArrayList<String> removeWord(ArrayList<String> al, String word){
		 
		 for(int i= 0; i<al.size(); i++) {
			 if(al.get(i).equals(word)) {
				 al.remove(al.get(i));
				 i--;
			 }
		 }
		 return al;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	  public static void main(String[] args) {
		
     // System.out.println(sumOf3(new int[]{2,3,5,3,6,3,7}));
	 //	System.out.println(isAnagram("elbow", "below"));
     // System.out.println(findMaxs(new int[]{5}));
		//  System.out.println(findsMaxs(singleArrayGenerator()));
	 //	  System.out.println(Arrays.toString(sortedArray(singleArrayGenerator(10))));
	 //  System.out.println(findUnique(new int[] {1,1,2,2,3,3,4,5}));
	//	  System.out.println(removeWord(new ArrayList<>(List.of("a","a","a","b"),  "a")));
	}

	
	}


