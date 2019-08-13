package by.htp.lab03.main;

public class task09 {
	public static void main(String[] args) {
		//like a 11 & 10
		int num = 1, sum = 0;
		
		while(num <= 100) {
			
			sum += num * num;
			num++;
		}
		
		System.out.println(sum);
	}

}
