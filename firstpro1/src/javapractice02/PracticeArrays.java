package javapractice02;

public class PracticeArrays {

	public static void main(String[] args) {
//		* Write a Java program that reverse a sentence by using Array
//        * (with all spaces and special characters)
//        *
//        * Input : Coding is greate.
//        * Output : .etaerg si gnidoC
//        *

		String str="Coding is greate.";
		String revStr = "";
		
		String arr[]=str.split("");
		for(int i=arr.length-1; i>=0;i--) {
			revStr=revStr+arr[i];
			
	}
		System.out.println(revStr);
		
		
		
	}

}
