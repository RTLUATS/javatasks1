package by.htp.lab03.main;

import java.util.Scanner;

public class task40 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter integer number N :");
		
		while(!in.hasNextInt()) {
			
			System.out.println("Error!Enter again");
			
			in.next();
		}
		
		int n = in.nextInt();
		
		for (int i = 1; i < n; i++) {
			
			int temp = i, a, temp1;
			boolean k = true;
			
			while((temp != 0) && k) {
				
				a =(int)( temp / Math.pow(10, 1));
				temp1 = temp - (a * 10); 
				
				if((temp1 == 0) || (i % temp1 != 0)) {
					
					k = false;
				}
				
				temp /= 10;
			}
			
			if (k) {
				
				System.out.println(i);
			}
		}
		
		in.close();
	}
}
