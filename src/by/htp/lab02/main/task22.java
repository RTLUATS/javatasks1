package by.htp.lab02.main;

public class task22 {
	public static void main(String[] args) {
		
		int x = 4, y = 5;
		
		if(x < y) {
			
			int temp = y;
			y = x;
			x = temp;
			
			System.out.println("x = " + x + " y = " + y);
		}
	}
}
