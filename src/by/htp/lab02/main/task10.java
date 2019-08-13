package by.htp.lab02.main;

import java.util.Scanner;

public class task10 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a, b;
		
		System.out.print("Please enter square first circle a :");
		
		while (!in.hasNextDouble()) {
			
			System.out.println("Error!");
			
			in.next();
		}
		
		a = in.nextDouble();
		
		System.out.print("Please enter square second circle b:");
		
		while(!in.hasNextDouble()) {
			
			System.out.println("Error!");
		
			in.next();
		}
		
		b = in.nextDouble();
		
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
