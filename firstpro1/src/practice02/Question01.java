package practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
	/*
	  	Write a program that finds the repeating letters in the text we receive from the user.
	 
	       *
	       * Step 1: Let's ask the user to enter some text.
	       * Step 2: Let's compare all letters with other letters.
	       * Let's use nested for loops for this.
	       * Step 3: Let's compare the letters in the inner for loop.
	       * If there is equality, it means repeating. Let's print it to the screen.
	       *
	       * Hint : When printing repetitive letters on the screen, be careful not to print them several times.
	       * create a List<Character> Pre-FoundLetters and insert the letters you find.
	       * If the letter is already printed on the screen, do not print it on the screen.
	       *
	       * Hint 2: To not print the space character " " (letter != ' ') if it is not equal to space
	       You can use the * condition.	
         */
		
		List<Character> repatingElement=new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		System.out.println("please enter a string for find the repating element");
		
		String str=scan.nextLine();
		
		char[] chars=str.toCharArray();
		System.out.println("repating elements are: ");
		
		for(int i =0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(chars[i]==chars[j]) {
					
					if(chars[i] !=' ' &&!repatingElement.contains(chars[i])) {
						
						repatingElement.add(chars[j]);
						System.out.println("repating elements are "+repatingElement);
						break;
					}
					
				}
			}
		}
	}

}
