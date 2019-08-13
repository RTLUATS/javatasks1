package by.htp.lab01.main;

public class task17 {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		double arif;
		double geom;

		arif = (Math.pow(a, 3) * Math.pow(b, 3)) / 2;
		geom = Math.abs(Math.pow(a * b, 0.5));
		
		System.out.println("Среднее арифметическое :" + arif);
		System.out.println("Среднее геометрическое :" + geom);
	}

}
