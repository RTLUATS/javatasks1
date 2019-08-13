package by.htp.lab03.main;

public class task39 {
	public static void main(String[] args) {
	
		int a, a1;
		
		for(int i = 100; i < 999; i++) {

			if(i % 7 == 0) {
				
				a = i / 100;
				a1 = i - a * 100;
				
				if((a1 * 7) == i) {
					
					System.out.println(i);
				}
			}
		}
	}
}
