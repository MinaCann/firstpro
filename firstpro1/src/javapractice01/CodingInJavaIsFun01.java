package javapractice01;

public class CodingInJavaIsFun01 {
	public static void main(String[]args) {
	
		//2. Write method that accepts a String and removes all duplicate from String. EX : aaabbc --> abc
      
//		static String removeDublicates(String str) {
//			
//			String result = "";
//			 
//			for(int i = 0; i<str.length(); i++) {
//				char eachLetter = str.charAt(i);
//				if(!result.contains(eachLetter + ""))
//					result +=eachLetter;
//			}
//			
//			return result;
//			
//		}
//		public static void main(String[] codingInJavaIsFun) {
//	System.out.println(removeDublicates("ayata"));
		
	// 4. Write a method that accepts a String and returns reverse of the same String. EX: java -> avaj
	

		System.out.println(isReverse(str));
	}
	   static String str = "abcde";
	
		static String isReverse(String str) {
			String reversedString ="";
		for(int i=str.length()-1;i>=0; i--) 
			reversedString +=str.charAt(i);
			return reversedString;
		}
		
    
    		
    	
		
	//9. Write a method that accepts an Array of integers and returns the max.
	//10. Write a method that accepts an Array of integers and returns the second max.

	//11. Write a method that accepts an Array of ints returns the sorted Array in ascending order.Do not use the sort method.
	
	
}
		
		

