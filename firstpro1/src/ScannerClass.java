import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your weight as kilogram...");
        System.out.println("Please enter your height as a meter...");
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
       
		double bmi= weight/height;
        
        System.out.println("Your bmi is : " +bmi + " ");
        if(bmi<18.5) {
        	System.out.println("You are weak...");
        }else if(bmi>=18.5 && bmi<=25) {
        	System.out.println("Your weight is ideal...");
        }else if(bmi>=25 && bmi<=30) {
        	System.out.println("You are fat...");
        }else if(bmi>=30) {
        	System.out.println("Obese...");
        }else if(bmi==23.99945916711736){
        	System.out.println("Your weight is ideal...");
        }
        
        
        
        
        
        
	}

}





