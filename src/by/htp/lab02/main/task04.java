package by.htp.lab02.main;

import java.util.Scanner;

public class task04 {
	public static void main(String[] args){
		
		int a, b;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число а :");
		
		while(!in.hasNextInt()) {
			
			System.out.println("Ошибка ввода!");
			in.next();
		}
		
		a = in.nextInt();
		
		System.out.println("Введите число b :");
		
		while(!in.hasNextInt()) {
			
			System.out.println("Ошибка ввода!");
			in.next();
		}
		
		b = in.nextInt();
		
		if(a == b) {
			
			System.out.println("true");
		}
		else {
			
			System.out.println("false");
		}
		
		in.close();
	}

}
