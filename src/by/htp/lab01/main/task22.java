package by.htp.lab01.main;

public class task22 {
	public static void main(String[] args) {
		int t = 85569;
		int th, tm, ts, temp, temp1;
		
		if(t >= 3600) {
			
			temp = t % 3600;
			th = t / 3600;
			
			if(temp >= 60) {
				
				temp1 = temp % 60;
				tm = (int) temp / 60;
				ts = t - th * 3600 - tm * 60 ; 
				System.out.println(th + " ч. " + tm + " минут " + ts + " секунд ");
			}
			else {
				
				ts = t - th * 3600;
				System.out.println(th + " ч. " + ts + "секунд");
			
			}
			
		}else if(t >= 60) {
			
			ts = t % 60;
			tm = t / 60 ;
			System.out.println(tm + " минут " + ts + " секунд ");
		}
		
		else {
			
			System.out.println(t + "секунд");
		}	
	}
}
