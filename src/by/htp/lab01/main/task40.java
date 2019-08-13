package by.htp.lab01.main;

public class task40 {
	public static void main(String[] args){
		
		double a, x = 2;
		
		a = x * (x * 2 *(1 - 2 * x) + ( x - 2));
		
		System.out.println(a);
		
		a = (1 + x  + 2 * (1 + x * (1 + 2 * x))) * x;
	}

}
