package arrays;
import java.util.Arrays;
public class ArraysClass{
	
	public static void main(String[] args) {
		/* write a method that accepts an integer array as input and prints
		* how many even numbers are there in this array?
		* arr={1,5,8,4,6}
		* output=3
		*/
//		int[]array={1,2,8,4,6};
//		int result=evenNumbers(array);
//	    System.out.println(result);
//	}
//   public static int evenNumbers(int[]array) {
//	   int out=0;
//	   for (int i = 0; i < array.length; i++) {
//		   if(array[i]%2==0) {
//			   out++;
//		   }
//	}
//     return out;
		
		String str="Javaisalsoeasy";
		   String str2="";
		   for(int i=0;i<str.length();i++){
		     if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))&&!str2.contains (String.valueOf(str.charAt(i)))) {
		      str2=str2+str.charAt(i);
		     }
		   }
		   char[] x=str2.toCharArray();
		  System.out.println( Arrays.toString(x));
		   
   }
	
}
    


