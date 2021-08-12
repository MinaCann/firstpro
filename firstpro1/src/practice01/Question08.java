package practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question08 {

//	public static void main(String[] args) {
		/*
		   write a return method that accepts an Multidimensional Array as input
		
		   Puts all element in a new list
		   and prints all elements in natural order
		  
		   Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
           Output:[Ali, Brad, Fox, John, Lee, Suzan]
		 */
		
		public static List<String> order(String[][] arr) {
			List<String> list = new ArrayList<>();
			for (String[] w : arr) {
				for (String x : w) {
					list.add(x);
				}
			}
			Collections.sort(list);
			return list;
		}
		
	}


