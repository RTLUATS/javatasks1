package by.htp.lab02.main;

import java.util.Scanner;

public class task08 {
	public static void main(String[] args) {
		
		int a, b;
		
		Scanner  in = new Scanner(System.in);
		
		System.out.print("Enter integer number a:");
		
		while (!in.hasNextInt()) {
			
			System.out.println("Error!");
			
			in.next();
		}
		
		a = in.nextInt() ;
		a = a * a;
		
		System.out.print("Please enter integer number b:");
		
		while(!in.hasNextInt()) {
			
			System.out.println("Error!");
			
			in.next();
		}
		
		b = in.nextInt();
		b = b * b;
		
		if (a > b) {
			
			System.out.print("a > b");
		}
		else if( a == b) {
			
			System.out.print("a == b");
		}
		else {
			
			System.out.print("a < b");
		}
		
		in.close();
		
	}

}
