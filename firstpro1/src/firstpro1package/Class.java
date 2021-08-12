package firstpro1package;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y=0;
		int d=0;
		int m=0;
		System.out.println("Please enter your number of minutes");
		m=scan.nextInt();
		d=m/(60*24);
		y=d/365;
		d=d%365;
		System.out.println(m+" minutes is approwimately "+y+" years "+d+" days");
		}
	}
