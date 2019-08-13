package by.htp.lab01.main;

public class task16 {
	public static void main(String[] args) {
		int a = 1234;
		int a1, a2, a3, a4, a5;

		a1 = a / 1000;
		a2 = (a / 100) - a1 * 10;
		a3 = (a/10) - a1*100 - a2*10;
		a4 = a - a1 * 1000 - a2 *100 - a3 * 10;
		a5 = a1 * a2 * a3 * a4;
		
		System.out.println("Начальное число : " + a);
		System.out.println("1-я цифра : " + a1 + "\t2-я цифра : " + 
				a2 + "\t3-я цифра : " + a3 +"\t4-я цифра : " + a4 );
		System.out.println("Произведение : " + a5);
	}

}
