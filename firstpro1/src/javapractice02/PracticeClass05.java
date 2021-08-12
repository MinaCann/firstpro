package javapractice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class PracticeClass05 {

	public static void main(String[] args) {
		/*create a string list which has five element and do the following:
	         *
	         * Names: {Jim,Jack,Tom,Lee,Pam}
	         *
	         * -) Add Lucy instead of Jim.
	         * -) Add the 3rd index to the Basic.
	         * -) Remove Jack from the list.
	         * -) Add Gregor to the list.
	         * -) Find the size of the list.
	         * -) Put in alphabetical order,
	         * -) Delete all the elements of the list.
        */
	
		List<String> list = new ArrayList<>();
		
		list.add("Jim");
		list.add("Jack");
		list.add("Tom");
		list.add("Lee");
		list.add("Pam");
		System.out.println(list);
				
	    list.set(list.indexOf("Jim"), "Lucy");
	    System.out.println(list);
	    
	    list.add(3, "Basic");
	    System.out.println(list);
	    
	    list.remove("Jack");
	    System.out.println(list);
	    
	    list.add("Gregor");
	    System.out.println(list);
	    
	    System.out.println(list.size());
	    Collections.sort(list);
	    System.out.println(list);
	    list.removeAll(list);
	    System.out.println(list);
	    
	    
	    
	    
	}

}
