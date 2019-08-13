package by.htp.lab01.main;

public class task08 {
	public static void main(String[] args) {
		double b = 2;
		double a = 5;
		double c = 5;
		double res;

		res = ((b + Math.pow(b * b + 4 * a * c, 1 / 2)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("Результат = " + res);

	}

}
