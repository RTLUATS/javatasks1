package by.htp.lab03.main;

import java.util.Scanner;

public class task27 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter m : ");
		
		while(!in.hasNextInt()) {
			
			System.out.println("Error!Enter again");
			
			in.next();
		}
		
		int m = in.nextInt();
		
		do {
			
			System.out.println("Enter n (n > m)!!! :");
		
			while(!in.hasNextInt()) {
				
				System.out.println("Error!Enter again");
				
				in.next();
			}
		
		n = in.nextInt();
			
		}while(n < m);
		
		while (n >= m) {
			
			System.out.print(m + ":");
			
			for(int i = 2; i < m; i++) {
				
				if (m % i == 0) {
					
					System.out.print(i + ",");
				}
			}
			
			System.out.println();
			
			m++;
		}
		
		in.close();
	}
}
