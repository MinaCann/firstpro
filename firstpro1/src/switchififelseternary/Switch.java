package switchififelseternary;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
//		Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)
//
//	    Sample:
//
//	      INPUT:
//
//	    Input a month number: 2
//
//	    Input a year: 2016
//
//	      OUTPUT  :
//
//	    February 2016 has 29 days
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a month");
		int month= scan.nextInt();
		int year=scan.nextInt();
		switch(month) {
		    case 1:
		    	System.out.printf("January %d has 31 days,year");
		    	break;
		    case 2:
		    	if(year%100==0 && year%400==0||year%100!=0 && year%4==0) {
		    		System.out.printf("February %d has 29 days ",year);
		    	
		    }else {
		    	System.out.printf("February %d has 28 days " ,year);
		    }
		    	break;
		    case 3:
		    	System.out.printf("March %d has 30 days" ,year);
		    	break;
		    case 4:
		       System.out.printf("April %d has 31 days ",year);
		       break;
		    case 5:
		       System.out.printf("May %d has 30 days ", year);
		       break;
		    case 6:
		    	System.out.printf("June %d has 31 days ",year);
		    	break;
		    case 7:
		    	System.out.printf("July %d has 30 days ",year);
		    	break;
		    case 8:
		    	System.out.printf("August %d has 31 days ",year);
		    	break;
		    	
		    case 9:
		    	System.out.printf("september %d has 30 days ",year);
		    	break;
		    	
		    case 10:
		    	System.out.printf("october %d has 31 days ",year);
		    	break;
		    case 11:
		    	System.out.printf("november %d has 30 days ",year);
		    	break;
		    case 12:
		    	System.out.printf("september %d has 30 days ",year);
		    	break;
		    	
		}
		

	}

}
