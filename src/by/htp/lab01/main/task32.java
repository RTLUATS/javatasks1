package by.htp.lab01.main;

public class task32 {
	public static void main(String[] args) {
			int h1 = 12, m1 = 43, s1 = 31;
			int h2 = 8, m2 = 24, s2 = 32;
			int h3 = 0, m3 = 0, s3 = 0; 
			
			if(((s1 + s2 + 1) > 59) && ((m1 + m2 + 1) > 59) && ((h1 + h2 +1) > 23)) {
				
				s2++;
				m2++;
				h2++;
				s3 = s2 + s1 - 60;
				m3 = m2 + m1 - 60;
				h3 = h2 + h1 - 24;
				
			}
			else if(((m1 + m2 + 1) > 59) && ((s1 + s2 + 1) > 59)) {
				
				m2++;
				h2++;
				s3 = s2 + s1 - 60;
				m3 = m2 + m1 - 60;
				h3 = h2 + h1;
				
			}
			else if(((m1 + m2 + 1) > 59) && ((h1 + h2 + 1) > 23)) {
				
				s2++;
				h2++;
				s3 = s2 + s1;
				m3 = m2 + m1 - 60;
				h3 = h2 + h1 - 24;
				
			}
			else if(((s1 + s2 + 1 ) > 59) && ((h1 + h2 +1) > 23)) {
				
				s2++;
				m2++;
				s3 = s2 + s1 - 60;
				m3 = m2 + m1;
				h3 = h2 + h1 - 24;
				
			}
			else if(((s1 + s2 + 1) > 59)) {
				
				m2++;
				s3 = s2 + s1 - 60;
				m3 = m2 + m1;
				h3 = h2 + h1;
				
			}
			else if(((m1 + m2 + 1) > 23)) {
				
				h2++;
				s3 = s2 + s1;
				m3 = m2 + m1 - 60;
				h3 = h2 + h1; 
				
			}
			else if(((h1 + h2 + 1) > 23)) {
				
				s2++;
				s3 = s2 + s1;
				m3 = m2 + m1;
				h3 = h2 + h1 - 24;
				
			}
			
			System.out.println(h3 + "чч." + m3 + "мм." + s3 + "cc.");
			
	}

}
