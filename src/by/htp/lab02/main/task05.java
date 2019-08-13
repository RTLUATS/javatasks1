package by.htp.lab02.main;

import java.util.Scanner;

public class task05 {
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sr = new Scanner(System.in);
		
		System.out.print("Введите целое число a :");
		
		while (!sr.hasNextInt()) {
			
			System.out.println("Ошибка ввода!");
			
			sr.next();
		}
		
		a = sr.nextInt();
		
		System.out.print("Введите целое число b:");
		
		while(!sr.hasNextInt()) {
			
			System.out.println("Ошибка ввода");
			
			sr.next();
		}
		
		b = sr.nextInt();
		
		if(a > b) {
			
			System.out.print("a > b");
		}
		else if(a == b) {
			
			System.out.print("a == b");
		}
		else {
			System.out.print("a < b");
		}
		sr.close();
	}

}
