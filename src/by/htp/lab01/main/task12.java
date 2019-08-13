package by.htp.lab01.main;

public class task12 {
	static public void main(String[] args) {
		int x1 = 2;
		int x2 = 7;
		int y1 = 2;
		int y2 = 5;
		double res;

		System.out.println("x1 = " + x1 + "\tx2 = " + x2 + 
				"\ty1 = " + y1 + "\ty2 = " + y2);

		res = Math.sqrt((x2 - x1) * (x2 - x1) - (y2 - y1) * (y2 - y1));

		System.out.println("Расстояние между двумя точками = " + res);
	}

}
