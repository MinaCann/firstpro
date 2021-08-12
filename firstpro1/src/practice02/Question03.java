//package practice02;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.ListIterator;
//
//
//public class Question03 {
//
//	public static void main(String[] args) {
//		
//		display();
//	}
//public static void display() {
//	List<String>list=new ArrayList<>();
//	try(BufferedReader br=new BufferedReader(new FileReader("State.txt"))) {
//	}
//	
//	      String line="";
//		
//			while(line=br.readLine()!=null) {
//				String str[]=line.split(", "); //Alabama montgomery
//				Collections.addAll(list,str);
//}
//	
//	Collections.sort(list, new Comparator<String>(){
//
//		@Override
//		public int compare(String o1, String o2) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//		
//	});
//	ListIterator<String> it=list.listIterator();
//	while(it.hasNext()){
//		System.out.println(it.next());
//	}
//	
//	
//}
//}
