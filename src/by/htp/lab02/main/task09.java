package by.htp.lab02.main;

import java.util.Scanner;

public class task09 {
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter first party number a:");
		
		while(!in.hasNextInt()) {
			
			System.out.print("Error!");
			
			in.next();
		}
		
		a = in.nextInt();
		
		System.out.print("Please enter second party number b:");
		
		while (!in.hasNextInt()) {
			
			System.out.println("Error");
			
			in.next();
		}
		
		b = in.nextInt();
		
		System.out.print("Please enter third party number c:");
		
		while(!in.hasNextInt()) {
			
			System.out.println("Error!");
			
			in.next();
		}
		
		c = in.nextInt();
		
		if((a == b) && (a == c)) {
			
			System.out.print("equilateral triangle");
		}
		else {
			
			System.out.print("no equilateral triangle");
		}
		
		in.close();
	}
}
