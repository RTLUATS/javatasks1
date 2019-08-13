package by.htp.lab02.main;

import java.util.Scanner;

public class task34 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите стоймость книги :");
		
		while(in.hasNextInt()) {
			
			System.out.println("Введите стоймость книги ввиде целого числа без букв!");
			
			in.next();
		}
		
		int a = in.nextInt();
		
		System.out.println("Введите количество ваших денег :");
		
		while(in.hasNextInt()) {
			
			System.out.println("Введите кол-во ваших денег ввиде целого числа без букв!");
			
			in.next();
		}
		
		int b = in.nextInt();
		
		System.out.println("Введите внесенную сумму :");
		
		while(in.hasNextInt()) {
			
			System.out.println("Введите внесенную сумму ввиде целого числа без букв!");
			
			in.next();
		}
		
		int c = in.nextInt();
		
		if(a < c) {
			
			int d = c - a;
			
			System.out.println("Внесённой суммы не хватает для преобретения книги");
			System.out.println("Вам необходимо внести ещё " + d);
		}
		else if(a == c) {
			
			System.out.println("Спасибо за покупку!");
		}
		else {
			
			int d = a - c;
			
			System.out.println("Ваша сдача " + d);
		}
		
		in.close();
	}

}
