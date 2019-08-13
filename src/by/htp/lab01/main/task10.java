package by.htp.lab01.main;

public class task10 {
	static public void main(String[] args) {
		double x = 2;
		double y = 1;
		double res;

		res = ((Math.sin(x) + Math.cos(y)) / (Math.cos(y) - Math.sin(x))) * Math.tan(x * y);

		System.out.println("Результат = " + res);
	}

}
