package by.htp.lab02.main;

public class task15 {
	public static void main(String[] args) {
		
		double a = 2, b = 3;
		
		if (a > b) {
			
			b = (b + a) / 2;
			a = a * b * 2;
			
			System.out.print("a :" + a + "\t b :" + b);
		}
		else {
			
			a = (b + a) / 2;
			b = b * a * 2;
			
			System.out.print("a :" + a + "\t b :" + b);
		}
	}
}
