package statickeyword;

import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("Enter your name");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter your grade");
		int grade = scanner.nextInt();
		System.out.println("Enter your registration year");
		int year = scanner.nextInt();
		
		
		Student std1 = new Student("Ali Can", 11, 2019);
		System.out.println(std1.id); 
		

		Student std2 = new Student("Veli Han", 11, 2019);
		System.out.println(std2.id);
        
		System.out.println("To quit press  Q , to continue press any button");
		String quit =scanner.next().toUpperCase();
		if(quit.equals("Q")) {
			break;
		}
		}while(true);
		System.out.println("See you later...");
	}

}
