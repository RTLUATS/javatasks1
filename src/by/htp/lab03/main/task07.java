package by.htp.lab03.main;

public class task07 {
	public static void main(String[] args) {
		//like a task08 
		int a = 1, b = 15, h = 2;
		int y = 1, x = 2, step;
		
		while (a < b) {
			
			if(a <= 2) {
				
				step = x;
				y = -step;
			}
			else {
				
				y = x;
			}
			a += h;
			
			System.out.println(y);
		}
	}

}
