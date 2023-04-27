package day1;
import java.util.Scanner;
public class Array {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//Array can be anonymously written like this
		// int[] myNumbers = {5,4,3,2,1};
		
		int[] myIntegers = getIntegers(5);
		for(int i = 0; i< myIntegers.length; i++) {
			System.out.println("Element " + i + " typed value was " + myIntegers[i]);
		}
		System.out.println("The average is "+ getAverage(myIntegers));
	}
	public static int[] getIntegers(int number) {
		System.out.println("Enter "+ number + " integer values.");
		int[] values = new int[number];
		
		for(int i = 0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	public static double getAverage(int[] array) {
		int sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
		}
		double aver = (double) (sum/ array.length);
		return aver;
	}

}
