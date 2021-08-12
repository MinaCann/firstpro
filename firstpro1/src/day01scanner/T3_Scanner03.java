package day01scanner;

public class T3_Scanner03 {

	public static void main(String[] args) {
		

		int sum =0;
	    for(int i=10; i>0;i=i-4) {
	 	   sum= sum+i;
	    }
	  //  System.out.println(sum);
	    
	    int sayi = 5479;
	    int rakamlarToplami=0;
	    int rakam = sayi%10;
	    rakamlarToplami += rakam;
	    sayi /=10;
	    
	     rakam=sayi%10;
	     rakamlarToplami += rakam;
	     sayi/=10;
	    
	     rakam=sayi%10;
	     rakamlarToplami += rakam;
	     sayi/=10;
	    
	     rakam=sayi%10;
	     rakamlarToplami += rakam;
	     sayi/=10; 
	    
	    System.out.println("Rakamlar toplami : " + rakamlarToplami);
	    System.out.println(sayi);
	}

}
