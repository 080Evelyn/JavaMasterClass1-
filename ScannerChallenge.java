package day1;
import java.util.Scanner;
public class ScannerChallenge {

	public static void main(String[] args) {
		int number, sum = 0;
		Scanner numeric = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter number #" + i);

			boolean isNextInt = numeric.hasNextInt();
			if (isNextInt) {
				number = numeric.nextInt();
				sum += number;
			} else {
				System.out.println("Invalid Number");
			}
			numeric.nextLine();
		}
		System.out.println("Sum " + sum);

		numeric.close();
	}
}
