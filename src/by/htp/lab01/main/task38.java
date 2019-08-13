package by.htp.lab01.main;

public class task38 {
	public static void main(String[] args) {
		double x = 1, y = 2;
		
		//a
		
		if(( x >= -4) && (x <= 4) && (y >= 0) && (y <= 4)) {
			
			if( y <= Math.abs(4 - x)) {
				
				System.out.println("1-е утверждение : true");
			}else {
				
				System.out.println("1-е утверждение : false");
			}
		}
		
		//b
		
		if((y >= 0 ) && ( x >= -2) && ( x <= 2) && (y <= 4)) {
			
			System.out.println("2-е утверждение : true");
		}
		else if((y == 0) && (x >= -4) && (x <= 4)) {
			
			System.out.println("2-е утверждение : true");
		}
		else if((y <= 0) && (x <= 4) && (x >= -4) && (y >= -3)) {
			
			System.out.println("2-е утверждение : true");
		}
		else {
			
			System.out.println("2-е утверждение : false");
		}
		
		//c
		
		if((x >= 0) && (x <= 4) && (y >= 0) && (y <= 4) ) {
			
			if((x * x + y * y) <= 16) {
				
				System.out.println("3-е утверждение : true");
			}
			else {
				
				System.out.println("3-е утверждение : false");
			}
			
		}
		else if((x >= 0) && (x <= 5) && (y <= 0) && (y >= -5)) {
			
			if((x * x + y * y) <= 25) {
				
				System.out.println("3-е утверждение : true");
			}
			else {
				
				System.out.println("3-е утверждение : false");
			}
		}
		else {
			
			System.out.println("3-е утверждение : false");
		}
	}

}
