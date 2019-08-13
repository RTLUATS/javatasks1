package by.htp.lab03.main;

import java.util.Scanner;

public class task33 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter integer number : ");
		
		while(!in.hasNextInt()) {
			
			System.out.println("Error! Enter again");
			
			in.next();
		}
		
		int a = in.nextInt();
		
		int temp = a;
		
		int a1, temp1, nmax = 0;
		
		temp = a;
		
		while(temp != 0) {
			
			a1 =(int)( temp / Math.pow(10, 1));
			temp1 = temp - (a1 * 10); 
			
			if(temp1 > nmax ) {
				
				nmax = temp1;
			}
			temp /= 10;
		}
		
		System.out.println("Max value :" + nmax);
		
		in.close();
	}
}
