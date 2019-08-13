package by.htp.lab01.main;

public class task34 {
	public static void main(String[] args) {
		int a = 2000000;
		double a1, a2;
		
		a1 =  a / Math.pow(10, 3);
		a2 =  a / Math.pow(10, 6);
		
		System.out.println((int)a + "байт\t" + (int)a1 + "Кбайт\t" + (int)a2 + "Мбайт");
		
	}

}
