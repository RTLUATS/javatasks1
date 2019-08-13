package by.htp.lab01.main;

public class task13 {
	public static void main(String[] args) {
		int x1 = 1;
		int x2 = 3;
		int x3 = 6;
		int y1 = 2;
		int y2 = 4;
		int y3 = 6;
		double ab, ac, bc;
		double Square;
		double Pp;
		double Perimetr;

		System.out.println(
				"x1 = " + x1 + "\tx2 = " + x2 + "\tx3 = " + x3 +
				"\ty1 = " + y1 + "\ty2 = " + y2 + "\ty3 = " + y3);

		ab = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		ac = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		bc = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		Perimetr = ab + bc + ac;
		Pp = Perimetr / 2;
		Square = Math.sqrt(Pp * (Pp - ab) * (Pp - bc) * (Pp - ac));


		System.out.println("AB = " + ab + "\tAC = " + ac + "\tBC = " + bc);
		System.out.println("Площадь = " + Square + "\tПериметр = " + Perimetr);
	}

}
