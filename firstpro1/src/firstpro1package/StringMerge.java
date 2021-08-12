package firstpro1package;

import java.util.Arrays;

public class StringMerge {

	public static void main(String[] args) {
		
//		String str = "Javalanguage";
//		String str1= "Isagood";
//		
//		System.out.println(merge(str,str1));
//}
// public static String merge(String str, String str1) {
//	  return str.substring(0,4).concat(str1)+str.substring(4,str.length());
		
		
//		String str = "bad JAVA";
//		String str1 = "bad";
//	    remove(str,str1);
//		
// }
//	public static String remove(String str,String str1) {
//		System.out.println(str.replace(str1, "").(trim());
		
		  //  ! Create a static method name: acceptString
		//  It should accept 3 strings as parameter
		//  ! and print them as an array
		//  ! e.g. String[] array = { "sam", "john", "tom" };
		//  ! acceptString("sam","john","tom");
		//  ! Then output: [sam,john,tom]

		
		String name1="sam";
		String name2= "john";
		String name3= "tom";
		acceptString(name1,name2,name3);
   }
	public static void acceptString(String name1, String name2, String name3) {
		String[] array= {name1,name2,name3};
		System.out.println(Arrays.toString(array));
		
	}
}
