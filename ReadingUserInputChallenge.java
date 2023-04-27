package day1;
import java.util.*;
public class ReadingUserInputChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		
		System.out.println("So how are you?");
		String checkUp = sc.next();	
		
		System.out.println("Are you sure? ");
		String certain = sc.next();
		
		System.out.println("When is your birth year?");
		
		boolean checkNextInt = sc.hasNextInt();
		if(checkNextInt) {
			int birthYear = sc.nextInt();
			int age = 2021 - birthYear;
			System.out.println("So what's your passion");
			String passion = sc.next();
			if(birthYear < 1) {
				System.out.println("Invalid birth year");
			}
			else {
				System.out.println("You are "+ age + "years old and passionate about "+ passion);
			}
		}
		else {
			System.out.println("Unable to pass year of birth");
		}
		sc.close();
	}
}
