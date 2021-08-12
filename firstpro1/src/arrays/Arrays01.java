package arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
	//	int myArray[]= {5, 4, 3};
	//	int arr[]=new int[2];
		
		String str[]= { "ali", "cennet", "ramazan", "esma"};
		System.out.println(Arrays.toString(str));
		
		String crr[]= new String[4]; 
		crr[0]= "yellow";
		crr[1]= "purple";
		crr[2]= "red";
		System.out.println(Arrays.toString(crr));
		
		
		String drr[]= new String[4]; 
	    drr[1]= "honda";
	    drr[3]="toyota";
	    drr[2]="bmw";
		
		System.out.println(Arrays.toString(drr));
				
         
	     int myArr[]=new int[10];
	   
	    for(int i=0; i<myArr.length; i++) {
	    	myArr[i]=i*3;
	    	
	    System.out.println(Arrays.toString(myArr));
	     }
		 
	    String grr= "Java ahh java...";
	     
		char ch1[]=grr.toCharArray();
		
		String ch2[]=grr.split(grr);
		System.out.println(Arrays.toString(ch1));
		
		
		int arr [] []= {{2, 3}, {4, 5, 3}};
		
		  /*    Type a program like; given an array whose length is 3, return an array with the
				elements "rotated left"
				For example; if the array is [1, 2, 3] output will be [2, 3, 1].
          */
	    
		int x[]= {1, 2, 3};
		int y[]=new int[x.length-1];
		
		for(int i=x.length-1;i<=3;i--)
			for(int j=x.length;j>=3;j++);
		     
	System.out.println(Arrays.toString(x));
	  
	
	

	 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
}