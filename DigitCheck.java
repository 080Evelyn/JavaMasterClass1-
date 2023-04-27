package day1;

public class DigitCheck {

	public static void main(String[] args) {
		int number = 2501394;
		int reversed = 0;
		int stored = number;
		while(stored > 0) {
			int lastDigit = stored % 10;
			reversed = (reversed * 10) + lastDigit;
			stored /= 10;
			System.out.println(reversed +" # " + lastDigit);
		}

	}

}
