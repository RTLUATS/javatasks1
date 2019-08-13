package by.htp.lab01.main;

public class task06 {
	public static void main(String[] args) {
		int n = 8;
		int m = 4;
		int l = 80;
		int k;

		System.out.println("Количество больших бидонов = " + m + "\tКоличество маленьких бидонов = " + n
				+ "\tКоличество молока в маленьких бидонах = " + l);

		k = l / n;

		System.out.println("\nКоличество молока в 1 маленьком бидоне = " + k + " литров");

		k = k + 12;

		System.out.println("\nКоличество молока в 1 большом бидоне = " + k + " литров");

		k = k * m;

		System.out.println("\nКоличество молока во всех больших бидонах = " + k + " литров");

	}

}
