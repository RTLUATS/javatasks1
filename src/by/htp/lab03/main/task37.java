package by.htp.lab03.main;

public class task37 {
	public static void main(String[] args) {
		
		for (int a = 10 ; a < 100; a++) {
			
			for(int b = 10; b < 100; b++) {
				
				if (((100 * a + b) % 99 == 0) && ((100 * b + a) % 49 == 0)) {
					
					System.out.println(a + "  |  " + b);
				}
			}
		}
	}
}
