package by.htp.lab02.main;

import java.util.Scanner;

public class task07 {
	public static void main(String[] args) {
		
		double a, b, c, x;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("enter the number a :");
		
		while(!in.hasNextDouble()) {
			
			System.out.println("Error!");
			
			in.next();
		}
		
		a = in.nextDouble();
		
		System.out.print("enter the number b:");
		
		while(!in.hasNextDouble()) {
			
			System.out.println("Error!");
			
			in.next();
		}
		
		b = in.nextDouble();
		
		System.out.print("enter the number c:");
		
		while(!in.hasNextDouble()) {
			
			System.out.println("Error!");
			
			in.next();
		}
		
		c = in.nextDouble();
		
		System.out.print("enter the number x:");
		
		while(!in.hasNextDouble()) {
			
			System.out.println("Error!");
			
			in.next();
		}
		
		x = in.nextDouble();
		
		double res;
		
		res = a * x * x + b * x + c ;
		
		System.out.println(res);
		
		in.close();
	}

}
