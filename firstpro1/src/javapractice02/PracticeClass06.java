package javapractice02;

import java.util.ArrayList;
import java.util.List;

public class PracticeClass06 {

	public static void main(String[] args) {
		/* * From the names in the list given as input
        * Write a program that deletes the letters 'a' in it
        *
        * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
        * OUTPUT : [Veli,Omer]
        */

		List<String>list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Veli");
		list.add("Ayse");
		list.add("Ayse");
		list.add("Fatma");
		list.add("Omer");
		
		System.out.println(list);
		
		List<String> list2 = new ArrayList<>();
		
		for(String w:list) {
			
		if(w.toLowerCase().contains("a")) { //w.contains("a") || w.contains("A")
			continue;
			
		}else {
			
			list2.add(w);
		}
			
			
		}
		System.out.println(list2);
	}

}
