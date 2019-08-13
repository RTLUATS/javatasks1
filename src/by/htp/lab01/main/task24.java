package by.htp.lab01.main;

public class task24 {
	public static void main(String[] args ) {
		int  a = 8, b = 4;
		double t, s, h, alpha = 1.5;
		
		t = (a - b) / 2;
		h = Math.tan(alpha) * t;
		s = t * h;
		
		System.out.println("Площадь = " + s);
;	}

}
