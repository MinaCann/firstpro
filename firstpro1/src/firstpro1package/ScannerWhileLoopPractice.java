package firstpro1package;

import java.util.Scanner;

public class ScannerWhileLoopPractice {
    public static void main ( String[] arg) {
    	Scanner scan = new Scanner(System.in);
     	System.out.println("Please enter integer...");
     	int number = scan.nextInt();	
    	     int x=1;
			while(x%2!=0) {
				System.out.println(x +" ");
				x++;			
			}
			
			
//   	Scanner scan = new Scanner(System.in);
//    	System.out.println("Please enter integer...");
//    	int number = scan.nextInt();
//    	
//    	
//    		int i=1;
//    		
//    		while(i<=120) {
//    	    System.out.println(i+ " * "+number+" = "+ number*i );
//    			i++;
//    		}

    	}
    }	

    

