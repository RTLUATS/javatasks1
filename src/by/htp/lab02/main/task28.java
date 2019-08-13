package by.htp.lab02.main;

public class task28 {
	public static void main(String[] args) {
	
		int a = 1, b = 2, c = 3, d = 4;
		
		if(a == d) {
			
			System.out.print("a == d");
		}
		else if(b == d) {
			
			System.out.print("b == d");
		}
		else if(c == d) {
			
			System.out.print("c == d");
		} 
		else {
			if ((a < b) && (a < c)) {
				
				System.out.println("d - a = " + (d - a));
			}
			else if((b < a) && (b < c)) {
				
				System.out.println("d - b = " + (d - b));
			}
			else if((c < a) && (c < b)) {
				
				System.out.println("d - c = " + (d - c));
			}
			
		}
	}
}
