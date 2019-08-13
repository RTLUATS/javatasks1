package by.htp.lab02.main;

public class task27 {
	public static void main(String[] args) {
		
		int a = 1, b = 3, c = 0, d = -1;
		
		if((a > b) && (c > d) && (b > d)) {
			
			System.out.println(" b the largest");
		}
		else if((a > b) && (c > d) && (b < d)) {
			
			System.out.println(" d the largest");
		}
		else if((a < b) && (c < d) && (a < c)) {
			
			System.out.println(" c the largest");
		}
		else if((a < b) && (c < d) && (a > c)) {
			
			System.out.println(" a the largest");
		}
	}
}
