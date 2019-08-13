package by.htp.lab02.main;

public class task16 {
	public static void main(String[] args) {
		
		int x = 2, y = -2;
		
		if (x > 0 && y > 0) {
			
			System.out.print("1 coordinate angle");
		}
		else if(x > 0 && y < 0) {
			
			System.out.print("2 coordinate angle");
		}
		else if(x < 0 && y < 0) {
			
			System.out.print("3 coordinate angle");
		}
		else if(x > 0 && y < 0) {
			
			System.out.print("4 coordinate angle");
		}
	}
}
