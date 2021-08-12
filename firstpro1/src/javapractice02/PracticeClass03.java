package javapractice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeClass03 {

	static List<String> productList= new ArrayList<>();
	static List<Float>  productPrice=new ArrayList<>();
	static float totalAmount;
	
	public static void main(String[] args) {
		/* Write a simple grocery shopping program.
	     Step 1: Select the product from the product list and ask how many kilos it is.
	     * Step 2: Ask if you want to buy another product.
	     * If he does not want, show the total amount, if he does, choose the product again.
	     * Repeat this process until you want to end the shopping.
	     Step 3: Every time the customer selects a product, add the price of the product he bought to the total price.
	     Step 4 : Show the total amount to be paid when the shopping is over.
	     */
		
		productList.add(" product name is tomotoes product code is 0");
		productList.add(" product name is watermelon product code is 1");
		productList.add(" product name is carrot product code is 2");		
		productList.add(" product name is plum product code is 3");
		productList.add(" product name is banana product code is 4");
		
		productPrice.add(2.0f);
		productPrice.add(3.0f);
		productPrice.add(4.0f);
		productPrice.add(5.0f);
		productPrice.add(5.0f);
		
		System.out.println("product list " +productList);
		
		customerShop();
		
	}
      private static void customerShop() {
    	  
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("Which product would you like ? ");
    	  int choose = scan.nextInt();
    	  System.out.println("How many kg you want");
    	  int kg=scan.nextInt();
    	  float kg1=scan.nextFloat();
    	  float totalPrice = productPrice.get(choose)*kg1;
    	  totalAmount = totalAmount+totalPrice;
    	  System.out.println("Your product is " +productList.get(choose));
    	  System.out.println("Your total amount is " +totalAmount);
    	  System.out.println("for continue shopping click 1 for the pay click 2 ");
    	  
    	  int opt = scan.nextInt();
    	  if(opt==1) {
    		  customerShop();
          }else {
    	       
        	  goToPay();
       }
    }
      
       private static void goToPay() {
    	   System.out.println("total price " +totalAmount);
       }
      
      
}
