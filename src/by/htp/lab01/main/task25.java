package by.htp.lab01.main;

public class task25 {
	public static void main(String[] args) {
		int a = 4, b = 4, c = -6;
		double d, x1, x2;

		d = Math.sqrt(b * b - 4 * a * c);

		if (d > 0) {

			x1 = (b - d) / 2;
			x2 = (b + d) / 2;
			
		}else {
			
			x1 = x2 = b / 2 * a;
		}
		
		System.out.println("x1 =" + x1 + " x2 =" + x2);
	}

}
