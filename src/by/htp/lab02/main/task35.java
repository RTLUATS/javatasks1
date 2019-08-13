package by.htp.lab02.main;

public class task35 {
	public static void main(String[] args) {
		
		int n = 56;
		
		if((n >= 1) && (n <= 31)) {
			System.out.println(n +" Января");
		} else if((n > 31) && (n <= 59)) {
			System.out.println((n - 31) + " Февраля");
		} else if((n > 59) && (n <= 90)) {
			System.out.println((n - 59) + " Марта");
		} else if((n > 90) && (n <= 120)) {
			System.out.println((n - 90) + " Апреля");
		} else if((n > 120) && (n <= 151)) {
			System.out.println((n - 120) + " Мая");
		} else if((n > 151) && (n <= 181)) {
			System.out.println((n - 151) + " Июня");
		} else if((n > 181) && ((n <= 212))) {
			System.out.println((n - 181) +" Июля");
		} else if((n > 212) && ((n <= 243))) {
			System.out.println((n - 212) +" Августа");
		} else if((n > 243) && ((n <= 273))) {
			System.out.println((n - 243) +" Сентября");
		} else if((n > 273) && ((n <= 304))) {
			System.out.println((n - 273) +" Октября");
		} else if((n > 304) && ((n <= 334))) {
			System.out.println((n - 204) +" Ноября");
		}else if((n > 334) && ((n <= 365))) {
			System.out.println((n - 334) +" Декабря");
		}else {
			System.out.println("Такого дня нету");
		}
	}
}
