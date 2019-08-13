package by.htp.lab02.main;

public class task14 {
	public static void main(String[] args) {
		
		double a = 50, b = 90;
		
		if((a + b) < 180) {
			
			if((a == 90) || (b == 90) || (180 - a + b) == 90) {
				
				System.out.print("This triangel is right triangle!");
			}
			else {
				
				System.out.print("This triangel isn't right triangle!");
			}
		}
		else {
			System.out.print("Such a triangle does not exist!");
		}
	}
}
