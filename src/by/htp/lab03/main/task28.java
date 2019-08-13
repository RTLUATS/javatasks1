package by.htp.lab03.main;

import java.util.Scanner;

public class task28 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		char stop = 'a';
		double res;
		
		do {
		
			System.out.println("Enter X : ");
			
			while(!in.hasNextInt()) {
				
				System.out.println("Error!Enter again");
				
				in.next();
			}
			
			int x = in.nextInt();
			
			System.out.println("Enter Y : ");
			
			while(!in.hasNextInt()) {
				
				System.out.println("Error!Enter again");
				
				in.next();
			}
			
			int y = in.nextInt();
			boolean n = false;
			
			do {
				
				System.out.println("Enter (choose :+,-,/,*) : ");
				
				char a = in.next().charAt(0);
				
				if (a == '+') {
					
					res = x + y;
					
					System.out.println("res = " + res);
					
					n = false;
					
				}else if (a == '-') {
					
					res = x - y;
					
					System.out.println("res = " + res);
					
					n = false;
					
				}else if (a == '/') {
					
					if (y != 0) {
						
					res = x / y;
					
					System.out.println("res = " + res);
					
					}else if ( x > 0){
						
						System.out.println("res = + INFINITY");
					}
					else if ( x < 0){
						
						System.out.println("res = - INFINITY");
					}
					
					n = false;
					
				}else if (a == '*') {
					
					res = x * y;
					
					System.out.println("res = " + res);
					
					n = false;
					
				}else {
					
					n = true;
				}
				
				
			}while(n == true);
			
			System.out.println("Enter if u wanna exit '0' : ");
			
			stop = in.next().charAt(0);
			
		}while (stop != '0');
		
		in.close();
	}
}
