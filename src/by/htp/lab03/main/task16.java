package by.htp.lab03.main;

public class task16 {
	public static void main(String[] args) {
		
		long n = 3, pr = 3, sum = 3;
		
		while (n < 11) {
			
			sum += n;
			pr *= sum;
			n++;
		}
		
		System.out.println(pr);
	}
}
