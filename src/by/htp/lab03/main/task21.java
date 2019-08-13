package by.htp.lab03.main;

public class task21 {
	public static void main(String[] args) {
		
		double a = 0, b = 15, h = 1, res;
		
		while (a <= b) {
			
			res = a - Math.sin(a);
			
			System.out.println(a + " |" + res);
			System.out.println("________________________");
			
			a += h;
		}
	}

}
