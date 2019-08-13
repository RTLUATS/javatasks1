package by.htp.lab02.main;

public class task13 {
	public static void main(String[] args) {
		
		int x1 = 1, x2 = -2, y1 = -1, y2 = 2;
		double r1, r2;
		
		r1 = Math.sqrt(x1 * x1  + y1 * y1);
		r2 = Math.sqrt(x2 * x2  + y2 * y2);
		
		if (r1 < r2) {
			
			System.out.print("x1 & y1 more closer");
		}
		else if (r1 == r2) {
			
			System.out.print("evenly");
		}
		else {
			
			System.out.print("x2 & y2 more closer");
		}
	}
}
