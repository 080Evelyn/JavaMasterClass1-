package day1;

public class Sum3and5Challenge {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				count++;
				sum += i;
				System.out.println("Number " + i +" is in position "+ count);
			}
			if (count == 10) {
				break;
			}
		}
		System.out.println("Sum = " + sum);

	}

}
