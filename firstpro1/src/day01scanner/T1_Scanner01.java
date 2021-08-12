package day01scanner;

import java.util.Scanner;

public class T1_Scanner01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
         System.out.println("Please write your firstname and lastname, after that pust ENTER button...");
         String firstname = scan.nextLine();
         String lastname = scan.nextLine();
         System.out.print("Isminiz: " +firstname+ " Soyisminiz: " +lastname+ " Thank you for attending our class");
         
         scan.close();
	}

}
