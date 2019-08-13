package by.htp.lab01.main;

import java.util.Scanner;

public class task33 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите любой символ :");
		
		char c = in.next().charAt(0);	
		int c1 = (int) c;
		
		System.out.println("код введённого символа :" + c1 );
		
		c = (char) (c1+1) ;
		c1 = (int) c;
		
		System.out.println("следующий символ :" + c);
		
		c = (char) (c1-2) ;
		
		System.out.println("предыдущий символ :" + c);
		
		in.close();
	}

}
