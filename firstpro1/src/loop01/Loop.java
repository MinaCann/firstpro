package loop01;


public class Loop {
	
	
	 public static boolean arePresent(String[] arr1){// [String, String2], String.contains()
		    for(int i=0;i<arr1[1].length();i++){
		        if(!arr1[0].toLowerCase().contains(Character.toLowerCase(arr1[1].charAt(i))+""))
		            return false;
		    }
		return true;
		    }



	
	
	
	public static void main(String[] args) {
		int fact =1;
		   int num = 6;
		   for(int i = num; i > 0;i--){
		     fact=fact*i;

		   }
		   System.out.print(num+"!=" + fact );


	}

}
