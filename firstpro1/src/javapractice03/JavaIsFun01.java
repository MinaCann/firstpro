package javapractice03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class JavaIsFun01 {
	// Write a function to check whether a string is pangram or not assuming that
	// the string passed in
	// does not have any punctuation. Pangrams are words or sentences containing
	// every letter of the alphabet at least once.
	// EX: The quick brown fox jumps over the lazy dog --> true
	// 1.Way
	static boolean isPangram(String str) {
		str = str.replace(" ", "").toUpperCase();
		ArrayList<Character> al = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			char each = str.charAt(i);
			// if(!al.contains(each) && each>=65 && each <=90) {
			// if(!al.contains(each) && each>='A' && each <='Z'){
			if (!al.contains(each) && Character.isLetter(each)) {
				al.add(each);
			}
		}

		return al.size() == 26;
	}
	static boolean isPangram2(String str){
        str = str.replace(" ", "").toUpperCase();
        String[] arr = str.split("");
        List<String> list = Arrays.asList(arr);
        HashSet<String> set = new HashSet<>(list);
        return set.size() == 26;
    }

	//2.Write a method where u ask a user to enter a number until the total is at least100 or number of trials is equal to 3.
    // EX: 1,2,3 --> You ran out of trials! EX2: 1,2,97 --> You made it! your sum is 100.
     
	static void sumGame() {
		Scanner scan= new Scanner(System.in);
		int sum,trials,input;
		sum=trials=0;
		while(sum<100&& trials<3) {
			System.out.println("Enter a number");
			sum+=scan.nextInt();
			trials++;
			if(trials ==3)
				break;
		}
		if( sum>= 100)
			System.out.println("You made it! Your sum is " +sum);
        else if(trials>=3)
			System.out.println("You ran out of trials!!");
	}
	
	//6.Write a method that reverses a number. Method accepts an integer and returns an int. EX: 123 --> 321
     
	static int reverseNumber(int num) {
		String result="";
		String str=String.valueOf(num);
		if(num<0) {
			str=str.substring(1);
			result +="-";
		}
		result = new StringBuilder(str).reverse().toString();
		return Integer.parseInt(result);
	}
	
	//7.Write a method that gets any number from a string it gets and returns the total of those number.EX :extractNum("aa2aa3") ==> 2+3 ==> 5.
	  
	
	
	
	
	public static void main(String[] args) {
	//System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
	//System.out.println(isPangram2("The quick brown fox jumps over the lazy dog"));
    // sumGame();
		System.out.println(reverseNumber(-123));
	}
}
