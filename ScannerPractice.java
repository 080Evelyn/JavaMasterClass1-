package day1;
import java.util.Scanner;
public class ScannerPractice {

	public static void main(String[] args) {
		int Mathematics, English, Physics, Chemistry, Biology;
		boolean check = true;
		double finalScore;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter Maths score:");
			Mathematics = input.nextInt();

			System.out.println("Enter English score:");
			English = input.nextInt();

			System.out.println("Enter Physics score:");
			Physics = input.nextInt();

			System.out.println("Enter Chemistry score:");
			Chemistry = input.nextInt();

			System.out.println("Enter Biology score:");
			Biology = input.nextInt();
			finalScore = (Mathematics + English + Physics + Chemistry + Biology) / 5;

			if (finalScore > 90) {
				System.out.println("Excellent");
			} else if (finalScore > 80) {
				System.out.println("Very good");
			} else if (finalScore > 60) {
				System.out.println("Good");
			} else if (finalScore > 40) {
				System.out.println("Average");
			} else {
				System.out.println("Poor");
			}
			System.out.println("Anymore students? (true/false)");
			check = input.nextBoolean();
		} 
		while(check);
	}
}
