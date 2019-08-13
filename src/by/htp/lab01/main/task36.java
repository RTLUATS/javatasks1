package by.htp.lab01.main;

public class task36 {
	public static void main(String[] agrs) {
		int a = 1234;
		int a1, a2, a3, a4;
		double n = 1, ch = 1;
		
		a1 = a / 1000;
		a2 = (a - (a1 * 1000)) / 100;
		a3 = ((a - (a1 * 1000)) - a2 * 100 ) / 10 ;
		a4 = (a-(a1 * 1000) - (a2 * 100 ) - a3 *10);
		
		if (a1 % 2 == 0) {
			ch *= a1;
		}
		else {
			n *= a1;
		}
		
		if(a2 % 2 == 0) {
			ch *= a2;
		}
		else {
			n *= a2;
		}
		
		if(a3 % 2 == 0) {
			ch *= a3;
		}
		else {
			n *= a3;
		}
		if(a4 % 2 == 0) {
			ch *= a4;
		}
		else {
			n *= a4;
		}
		
		n = ch / n;
		
		System.out.println("частное произведений равно : " + n);
	}

}
