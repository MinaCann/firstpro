package practice01;

public class Question10 {

	//public static void main(String[] args) {
	
	      /*	Write a return method that accepts more than one integer as parameter
		        and prints the sum of integers
		        
		        Method name = sum
		        if you call method like that sum(1,2,3) output =6
		                                     sum(1,2,3,4,5) output =15
		                                    sum(1,2) output=3
		        */

		
	public static int sum(int...arr) {
		int summer=0;
		for(int w:arr) {
			summer+=w;
		}
		System.out.println(summer);
		return summer;
	}

}
