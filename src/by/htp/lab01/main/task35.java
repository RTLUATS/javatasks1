package by.htp.lab01.main;

public class task35 {
	public static void main(String[] args) {
		
		double m = 59, n = 3;
		int n1, n2;
		
		m = m / n;
		n1 = ((int)m) % 10;
		n2 =((int)(m * 10)) % 10;

		System.out.print("младшая цифра : " + n1);
		System.out.print("\nстаршая цифра : " + n2);
		
	}
}
