package day1;
import java.util.Scanner;
import java.util.Arrays;

public class MinimumElementChallenge {
	

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("Enter the number of count = ");
		int count = input.nextInt();
		input.nextLine();
		
		int[] returnedArray = readIntegers(count);
		int returnedMin = findMin(returnedArray);
		
		System.out.println("min = " + returnedMin);
			}
	private static int[] readIntegers(int count) {
		int[] value = new int[count];
		for(int i = 0; i < value.length; i++) {
			System.out.println("Read the count: ");
			value[i] = input.nextInt();
			input.nextLine();
		}
		return value;
	}
	private static int findMin(int[] value) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < value.length; i++) {
			int array = value[i];
			if(array < min) {
				min = array;
			}
		}
		return min;
	}

}
