package day1;

public class Palindrome {

	public static void main(String[] args) {
		//for(int number = 11; number <= 100000; number++) {
			int number = 25252;
		int stored = number;
		int reversed = 0;
		while(stored > 0) {
			int lastDigit = stored % 10;
		reversed = (reversed * 10) + lastDigit;
		stored /= 10;
		}
		if(number == reversed) {
			System.out.println("Invalid");
		}
		else {
			System.out.println(reversed +" = "+ number);
		}
		//}

	}

}
