package practice01;

import java.util.ArrayList;
import java.util.Arrays;

public class Question07 {

	public static void main(String[] args) {
		/* write a program to find the common elements between two String Arrays
        * (without case sensitivity)
        *
        * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
        *
        * Output : [sofia,brad,emily]
        */
		
	    String myArray[] ={"John","Brad","Ange","Sofia","Emily"};
	    String myArray1[] ={"sofia","brad","grace","emily","hazel"};
		
	    ArrayList<String> list= new ArrayList<>();
	    
	    for(String w: myArray) {
	    	for(String z: myArray1) {
	    		if(w.equalsIgnoreCase(z)) {
	    			list.add(w);
	    			
	    		}
	    	}
	    }
	    System.out.println(list);
	    
		
		
	}

}
