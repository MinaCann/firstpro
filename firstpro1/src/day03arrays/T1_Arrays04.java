package day03arrays;

import java.util.Arrays;

public class T1_Arrays04 {

	public static void main(String[] args) {
		
		
		String str = "Java, candir.";
		System.out.println(Arrays.toString(str.split("a")));
		String bolunmusKelimeArray[]=str.split(",");
		System.out.println(bolunmusKelimeArray[1]);
		System.out.println(bolunmusKelimeArray.length);
		
		String bolunmusKelimeArray1[]=str.split(" ");
		System.out.println(Arrays.toString(bolunmusKelimeArray1));
		
		String cumle="Java ogren, rahat yasa";
		String cumle2=cumle.replaceAll("\\W", "");
		System.out.println(cumle2);
		System.out.println(cumle2.length());
		
		System.out.println("===================");
		
		int random[]= {6, -4, 12, 0, -10};
	    Arrays.sort(random);
		int x=12;
		int y= Arrays.binarySearch(random, x);
		System.out.println(y);
		
		
		
		
		
	//	String s4[]="John";
		
	//	System.out.println("John".replaceAll("", ","));
	}

}
