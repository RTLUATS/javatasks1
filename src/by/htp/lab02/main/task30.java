package by.htp.lab02.main;

public class task30 {
	public static void main(String[] args) {
		
		int a = 1, b = 2, c = 3;
		
		if ((a > b) && (b > c)) {
			
			a *= 2;
			b *= 2;
			c *= 2;
			
			System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
		}
		else {
			
			a = b = c = 0;
			
			System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
		}
	}

}
