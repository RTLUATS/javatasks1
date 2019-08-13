package by.htp.lab03.main;

public class task05 {
	public static void main(String[] args) {
		//like a task06 + Scanner
		int sum = 0, a = 1;
		
		while(a < 100) {
			
			if(a % 2 != 0) {
				
				sum += a;
			}
			
			a++;
		}
		
		System.out.println(sum);
	}
}
