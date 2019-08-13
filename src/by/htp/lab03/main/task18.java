package by.htp.lab03.main;

public class task18 {
	public static void main(String[] args) {
		
		double e = 0.01, sum = 0, n = 1, an;
		
		while (n < 1000) {
			
			an = Math.pow(-1, n - 1) / n ;
			
			if(Math.abs(an) == e) {
				
				sum += an;
			}
			
			n++;
		}
		
		System.out.println(sum);
	}

}
