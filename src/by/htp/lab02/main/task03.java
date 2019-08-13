package by.htp.lab02.main;

import java.util.Scanner;

public class task03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a;
		int b = 3;
		a = in.nextInt();

		System.out.println("1-е число = " + a + "\t2-е число = " + b);

		if (a < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		in.close();
	}

}
