package day1;
import java.util.Scanner;
public class MinAndMaxChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Max = Integer.MIN_VALUE, Min = Integer.MAX_VALUE;
		
		while(true) {
			System.out.println("Enter number:");
			boolean isAnInt = sc.hasNextInt();
			if(isAnInt) {
			int numeric = sc.nextInt();
			
			if(numeric < Min) {
				Min = numeric;
			}
			if(numeric > Max) {
				Max = numeric;
			}
			}else {
				break;
			}
			sc.nextLine();
		}
		System.out.println("Max " + Max + " and Min = " + Min);
		
	}
}