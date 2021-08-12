package javapractice02;

public class PracticeClass04 {

	public static void main(String[] args) {
		//Write java code to get rid of multiple spaces from a string.
		
		//"I am learning  Java. I liked it    very much."
		//I am learning  Java. I liked it very much.

		
		String sb = "I am learning  Java. I liked it    very much.";
		String sb1=sb.trim().replaceAll("\\s+", " ");
		System.out.println(sb1);
	}

}
