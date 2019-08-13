package by.htp.lab03.main;

import java.util.Scanner;

public class task24 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter integer number : ");
		
		while(!in.hasNextInt()) {
			
			System.out.println("Error! Please enter again");
			
			in.next();
		}
		
		int a = in.nextInt();
		int newa = 0;
		int n = 1, a1, sum = 0;
		
		if(a >= 10) {
			
			int temp = a, count = 0	;
			
			while(temp != 0) {
				
				count++;
				temp/=10;
				
			}
			
			temp = a;
			
			int temp1;
			
			while(temp != 0) {
				
				a1 =(int)( temp / Math.pow(10, n));
				temp1 = temp - (a1 * 10); 
				
				if(temp1 % 2 == 0) {
					
					sum += temp1;
				}
				
				newa += temp1 * Math.pow(10, count - 1);
				count--;
				temp /= 10;
			}
			
		}
		else {
			
			if (a % 2 == 0 ) {
				
				System.out.println(" sum = " + a);
			}else {
				
				System.out.println(" sum = " + sum);
			}
		}
		
		System.out.println(a + " <=a " + newa + " <=new a " + " sum = " + sum);
		
		in.close();
	}

}
