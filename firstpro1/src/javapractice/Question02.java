package javapractice;

import java.util.Arrays;

public class Question02 {

	public static void main(String[] args) {
//		* Write a Java program that reverse a sentence by using Array
//        * (with all spaces and special characters)
//        *
//        * Input : Coding is greate.
//        * Output : .etaerg si gnidoC
        
       String name[]={"Coding is greate."};
       String x="";
       String arr[]=x.split("");
	      for(int i=name.length-1;i>0;i--) {
		x=x+name[i];
	  }
	      System.out.println(x);
	
  }
}
