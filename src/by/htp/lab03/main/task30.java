package by.htp.lab03.main;

import java.util.Scanner;

public class task30 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		String a ;
		int last = 2000;
		
		System.out.println("Enter romanic number : ");
			
		a = in.next();
		int num = 0, res = 0;
		
		for (int i = 0; i < a.length(); i++){
			
			char ch = a.charAt(i);
			
			switch (ch) {
				
			case 'I':  num = 1;
			break;
			case 'V':  num = 5;
			break;
			case 'X':  num = 10;
			break;
			case 'L':  num = 50;
			break;
			case 'C':  num = 100;
			break;
			case 'D':  num = 500;
			break;
			case 'M':  num = 1000;
			break;
			default:   System.out.println("Error!");
			break;
			}
			
			if ((last == 1) && last < num) {
				
				num = num - last - 1;
			}else if(last < num) {
				
				num = num - last;
			}
			
			
			res += num;
			last = num;
			
		}
		System.out.println(res);
		
		in.close();
	}
}
