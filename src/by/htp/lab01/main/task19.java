package by.htp.lab01.main;

public class task19 {
	public static void main(String[] args) {
		int a = 4;
		double Square, h, r, r1;

		Square = (a * a * Math.sqrt(3)) / 4;
		h = 2 * Square / a;
		r = (Math.sqrt(3) * a) / 6;
		r1 = r * 2;
		
		System.out.println("Площадь:" + Square + "\nВысота:" + h 
				+ "\nРадиус вписанной окр:" + r + "\nРадиус описанной окр:" + r1);
	}

}
