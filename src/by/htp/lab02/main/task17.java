package by.htp.lab02.main;

public class task17 {
	public static void main(String[] args) {
		
		int m = 3, n = 1;
		
		if(m != n) {
			
			if(m > n) {
				
				n = m;
			}
			else {
				
				m = n;
			}
		}
		else {
			
			m = n = 0;
		}
		
		System.out.print("m = " + m + " n = " + n);
	}

}
