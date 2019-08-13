package by.htp.lab02.main;

public class task26 {
	public static void main(String[] args) {
		int a = 1, b = 1, c =3;
		
		if((a > b) && (a > c) && (b > c)) {
			
			System.out.println(" a  the largest & c the smollest");
		}
		else if((a > b) && (a > c) && (c > b)) {
			
			System.out.println(" a  the largest & b the smollest");
		}
		else if((b > a) && (b > c) && (a > c)) {
			
			System.out.println(" b  the largest & c the smollest");
		}
		else if((b > a) && (b > c) && (a < c)) {
			
			System.out.println(" b  the largest & a the smollest");
		}
		else if((c > a) && (c > b) && (a > b)) {
			
			System.out.println(" c  the largest & b the smollest");
		}
		else if((c > a) && (c > b) && (b > a)) {
			
			System.out.println(" c  the largest & a the smollest");
		}
		
	}
	
}
