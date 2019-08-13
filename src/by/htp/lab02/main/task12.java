package by.htp.lab02.main;

public class task12 {
	
	public static void main(String[] args) {
		
		int a = -1, b = 0, c = 2;
		
		if(a >= 0) {
			
			a *= a;
			
			System.out.println("a = " + a);
		}
		else {
		
			a *= (a * a * a);
			
			System.out.println("a = " + a);
		}
		
		if(b >= 0) {
			
			b *= b;
			
			System.out.println("b = " + b);
		}
		else {
		
			b *= (b * b * b);
			
			System.out.println("b = " + b);
		}
		
		if(c >= 0) {
			
			c *= c;
			
			System.out.println("c = " + c);
		}
		else {
		
			c *= (c * c * c);
			
			System.out.println("c = " + c);
		}
	}

}
