package by.htp.lab02.main;

import java.util.Scanner;

public class task21 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in); 
		
		char a;
		
		System.out.print("Кто ты: мальчик или девочка? Введи Д или М");
		
		a = in.next().charAt(0);
		
		if (a == 'Д') {
			
			System.out.print("Мне нравятся девочки!");
		}
		if (a == 'М') {
			
			System.out.print("Мне нравятся мальчики!");
		}
		in.close();
	}
}
