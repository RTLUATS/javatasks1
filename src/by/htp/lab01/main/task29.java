package by.htp.lab01.main;

public class task29 {
	public static void main(String[] args) {
		double ab = 7, bc = 4, ac = 5;
		double cabc, cbac, cacb;

		cabc = (ab * ab + bc * bc - ac * ac) / (2 * ab * bc);
		cbac = (ab * ab + ac * ac - bc * bc) / (2 * ab * ac);
		cacb = (ac * ac + bc * bc - ab * ab) / (2 * ac * bc);
		cabc = Math.acos(cabc);
		cbac = Math.acos(cbac);
		cacb = Math.acos(cacb);
		
		System.out.println("Радианы углов треугольника :" + cabc + " ; " 
				+ cabc + ";" + cacb);

		cabc *= 57.2958;
		cbac *= 57.2958;
		cacb *= 57.2958;

		System.out.println("Градусы углов треугольника :" + cabc + " ; " 
				+ cabc + ";" + cacb);
	}

}
