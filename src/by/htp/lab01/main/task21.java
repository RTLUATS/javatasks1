package by.htp.lab01.main;

public class task21 {
	public static void main(String[] args) {
		double a = 222.111;
		int b;
		double c, d;

		b = (int) a;
		c = (a * 1000 - b * 1000) / 1000.0;
		d = c * 1000 + b / 1000.0;

		System.out.println(d);
	}

}
