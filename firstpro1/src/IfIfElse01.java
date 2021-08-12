import java.util.Scanner;

public class IfIfElse01 {

	public static void main(String[] args) {
//		Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
//		(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
//        Input :
//       John White 1234234534561478
//		Output :
//		Name : J* W**
//        CCN : ** ** **** 1478

		Scanner scanner= new Scanner(System.in);
		System.out.println("PLease enter your name...");
		String name = scanner.next().toUpperCase();
		System.out.println("Please enter your surname...");
		String surname = scanner.next() .toUpperCase();
		System.out.println("Please enter your credit card number");
		String cnum = scanner.next();
		if (cnum.length()!=16) {
			System.out.println("Invalid credit card number");
		}else {
			
		
		String Convertedname= name.charAt(0) + "************" ;
		System.out.println(Convertedname);
		 String Convertedsurname = surname.charAt(0) + "*************";
			System.out.println(Convertedsurname);
		String ConvertedCnum = "**** **** **** " +cnum.substring(12);
		System.out.println(ConvertedCnum);
		
		}	}

}
