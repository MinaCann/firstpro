package javapractice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeClass07 {

	public static void main(String[] args) {
		/*Create a class : RandomNameGenerator
        * Step1: Ask user to enter his/her name //john walker
        * Step2: Delete the spaces in the username//johnwalker
        * Step3: Check if the username is already taken//list("sam","johnmary","johnwalker","johnwalker523463146")
        * Step4: If there the username is not taken, then print: This username is available
        * Step5: If the username is already taken, then print This username is already
       username
       */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter your name");
//		String name = scan.nextLine();
//		name = name.toLowerCase().replaceAll(" ", "");
	
		
		List<String> userList=new ArrayList<>();
		
		userList.add("sam");
		userList.add("johnmary");
		userList.add("johnwalker");
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter your name");
		String myName=scan.nextLine();
		
		for(String name:userList) {
			
			if(name.equalsIgnoreCase(myName)) {
				
				System.out.println("this name already taken");
				break;
				
			}
			
			else {
				
				
				System.out.println("this name is available for the list ");
				break;
			}
			
			
		}
		
	}

}
