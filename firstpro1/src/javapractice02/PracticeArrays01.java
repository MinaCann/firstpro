package javapractice02;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrays01 {

	public static void main(String[] args) {
		//fetch data from user and type it as reverse don't use for loop
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("Enter string");
//		String string= scan.nextLine();
//		
//		StringBuilder strb=new StringBuilder();
//		System.out.println(strb.append(string).reverse());
		
	//// ! Create a static void method: acceptArray
        // It should take one String array as parameter
        // ! and print them as an array
        // ! e.g String[] array = { "sam", "john", "tom" };
        // ! acceptArray(array);
        // ! Then output: [sam,john,tom]
        // ! Create another static method :acceptArray2
        // It should take one String array as parameter
        // ! and print each element in the array
        // ! e.g String[] array = { "sam", "john", "tom" };
        // ! acceptArray2(array);
        // ! Then output: sam john tom
		
		String []  array= { "sam", "john", "tom" };
		
		acceptArray(array);
		acceptArray2(array);
	}
	public static void acceptArray(String[] array) {	
		
		System.out.println(Arrays.toString(array));
	}
	public static void acceptArray2(String[]array){
		
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
		
	}

}
}