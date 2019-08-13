package by.htp.lab01.main;

public class task37 {
	public static void main(String[] args){
		double n = 23.45;
		
		if((n % 2 == 0) && (( n / 10) >= 1) && ((n / 100) < 1)) {
			
			System.out.println("1-е утверждение : true");
		}
		else {
			
			System.out.println("1-е утверждение : false");
		}
		
		if((n >= 1000) && (n < 10000)) {
			
			int a1, a2, a3, a4;
			
			a1 = (int) (n / 1000);
			a2 = (int)((n - a1 * 1000) / 100);
			a3 = (int)((n - a1 * 1000 - a2 * 100) / 10);
			a4 = (int)(n- a1 * 1000 - a2 * 100 - a3 * 10);
			
			if((a1 + a2) == (a3 + a4)) {
				
				System.out.println("2-e утверждение : true");
			}
			else {
				System.out.println("2-e утверждение : false");
			}
		}
		else {
			System.out.println("2-e утверждение : false");
		}
		
		if((n >= 100) && (n <= 1000)) {
		
			int a1, a2, a3;
			
			a1 = (int) (n / 100);
			a2 = (int)((n - a1 * 100) / 10);
			a3 = (int)(n - a1 * 100 - a2 * 10);
			a1 = a1 + a2 + a3;
			
			if(a1 % 2 == 0) {
				
				System.out.println("3-e утверждение : true");
			}
			else{
				System.out.println("3-e утверждение : false");
			}
			
		}
		else{
			System.out.println("3-e утверждение : false");
		}
		
		int x = 4, y = 3, m = 6, k = 3;
		
		if((x >= k) && (x <= m)) {
			
			System.out.println("4-e утверждение : true");
		}
		else {
			
			System.out.println("4-e утверждение : false");
		}
		
		double p = 345;
		
		if((p >= 100) && (p <= 1000)) {
			
			int a1, a2, a3;
			a1 = (int) (p / 100);
			a2 = (int)((p - a1 * 100) / 10);
			a3 = (int)(p - a1 * 100 - a2 * 10);
			a1 = a1 + a2 + a3;
			p = Math.pow(p, 2);
			a1 = a1 * a1 * a1;
			
			if(p == a1) {
				
				System.out.println("5-e утверждение : true");
			}
			else {
				
				System.out.println("5-e утверждение : false");
			}
		}
		else {
			
			System.out.println("5-e утверждение : false");
		}
		
		int a = 2, b = 3, c = 4;
		
		if(a == b || b == c || a == c) {
			
			System.out.println("6-e утверждение : true");
		}
		else {
			
			System.out.println("6-e утверждение : false");
		}
		
		if((n >= 100) && (n <= 1000)) {
		
			int a1, a2, a3;
		
			a1 = (int) (n / 100);
			a2 = (int)((n - a1 * 100) / 10);
			a3 = (int)(n - a1 * 100 - a2 * 10);
			
			if((a1 + a2) == a3) {
				
				System.out.println("7-e утверждение : true");
			}
			else {
				
				System.out.println("7-e утверждение : false");
			}
		}
		else {
			
			System.out.println("7-e утверждение : false");
		}
		
		double a9 = 2.6;
		
		if((n == a9) || (n == (a9 * a9) || (n == (a9 * a9 * a9)  || (n == (Math.pow(a9, 4)))))) {
			
			System.out.println("8-e утверждение : true");
		}
		else {
			
			System.out.println("8-e утверждение : false");
		}
		
		double m2 = 4, n2 = 5.6, a2 = 1, b2 = 8, c2 = 34;  
		
		if(n2 == (m2 * m2 * a + m2 * b2 + c2  ) ) {
			
			System.out.println("9-e утверждение : true");
		}
		else {
			
			System.out.println("9-e утверждение : false");
		}
		
		
	}

}
