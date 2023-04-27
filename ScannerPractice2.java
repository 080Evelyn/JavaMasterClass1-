package day1;
import java.util.Scanner;
public class ScannerPractice2 {

	public static void main(String[] args) {
		int English, Maths, Chemistry, Physics, Biology, studentsNumber;
		double finalScore;
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter number of Students:");
		studentsNumber = marks.nextInt();
		
		for(int i = 0; i< studentsNumber; i++) {
				System.out.println("Enter Maths score:");
				Maths = marks.nextInt();
				
				System.out.println("Enter English score:");
				English = marks.nextInt();

				System.out.println("Enter Chemistry score:");
				Chemistry = marks.nextInt();

				System.out.println("Enter Physics score:");
				Physics = marks.nextInt();

				System.out.println("Enter Biology score:");
				
				Biology = marks.nextInt();
				finalScore = (Maths + English + Chemistry + Physics + Biology) / 5;
				
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
		}
	}

}
