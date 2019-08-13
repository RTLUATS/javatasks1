package by.htp.lab03.main;

public class task12 {
	public static void main(String[] args) {
		
		long a1 = 1, n = 2, pr = 1;
		
		long a2 = a1 + 6;
		
		while(n <= 10) {
			
			pr *= a2;
			a1 = a2;
			a2 = a1 + 6;
			n++;
			
		}
		
		System.out.println(pr);
	}

}
