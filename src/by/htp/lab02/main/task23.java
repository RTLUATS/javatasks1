package by.htp.lab02.main;

import java.util.Scanner;

public class task23 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b;
		
		boolean flag = false;
		
		do {
		
			System.out.print("Enter the day number of the month :");
		
			while(!in.hasNextInt()) {
				
				System.out.println("Error!\nEnter again:");
				
				in.next();
			}
			
			a = in.nextInt();
			
			if((a >= 1 ) && (a <= 31)) {
				
				flag=true;
			}
			
		}while(!flag);
		
		flag = false;
		
		do {
			
			System.out.print("Enter the month number :");
		
			while(!in.hasNextInt()) {
				
				System.out.println("Error!\nEnter again:");
				
				in.next();
			}
			
			b = in.nextInt();
			
			if((b >= 1 ) && (b <= 12)) {
				
				flag = true;
			}
			
		}while(!flag);
		
		in.close();
		
	}
}
