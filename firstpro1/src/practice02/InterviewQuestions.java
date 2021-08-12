package practice02;

import java.util.Arrays;

public class InterviewQuestions {
	
	public static void main(String[] args) throws MyException {

		int[] arr = { 12, 4, 5, 9, 8, 65, 5, 4, 333, 3, 2 };

		sorter(arr);
		repeater("Ramazan");
        
	}
	
    
	// Write a method that returns how many times each letter is repeated? ramazan

	public static void repeater(String str) throws MyException { // r=1, a=3
		String store="";
      if(str instanceof String) {
		store = "";
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			counter = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {

					counter++;
				}
			}
			if (!store.contains(str.charAt(i) + ""))
				store = store + str.charAt(i) + "=" + counter;

		}
		
	}else {
		throw new MyException("Please enter a string");
			
		
	}
      System.out.println(store);
	}
	// Write a method that sorts an Array int[] without using the sort method.

	public static void sorter(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	
	}
}
  class MyException extends Exception {
	
  public MyException(String message)	{
	super();
}
	
}