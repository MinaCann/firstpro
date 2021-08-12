package practice01;

import java.util.Scanner;

public class Question09 {
    /*
	 * Step 1: Let's ask the user to enter some text. Step 2: Let's compare all
	 * letters with other letters. Let's use nested for loops for this. Step 3:
	 * Let's compare the letters in the inner for loop. If there is equality, it
	 * means repeating. Let's print it to the screen.
	 *
	 * Hint : When printing repetitive letters on the screen, be careful not to
	 * print them several times. create a List<Character> Pre-FoundLetters and
	 * insert the letters you find. If the letter is already printed on the screen,
	 * do not print it on the screen.
	 *
	 * Hint 2: To not print the space character " " (letter != ' ') if it is not
	 * equal to space You can use the * condition.
	 */

	public static String repeat() {
		Scanner in=new Scanner(System.in);
		System.out.println("string ?");
		String str=in.next();
	    char arr[]=str.toCharArray();
		String store="";
		for(int i=0;i<str.length();i++) {
			String temp="";
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>1) {
			temp=arr[i]+"==>"+count+"\n";	
			}
			if(!store.contains(temp)) {
				store+=temp;
			}
		}
		store=store.length()>0?store:"No repeatiton!";
		System.out.println(store);
		return store;
	}
}