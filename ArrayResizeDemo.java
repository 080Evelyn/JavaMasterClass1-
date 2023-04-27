package day1;

import java.util.Scanner;

public class ArrayResizeDemo {
	
	private static Scanner sc = new Scanner(System.in);
	private static int[] baseData = new int[10];

	public static void main(String[] args) {
		System.out.println("Enter 10 integers:");
		getInput();
		printArray(baseData);
		resizeArray();
		System.out.println("Enter 12 numbers");
		getInput();
		baseData[10] = 67;
		baseData[10] = 34;
		printArray(baseData);
		
	} 
	
	private static void getInput() {
		
		for(int i = 0; i<baseData.length;i++) {
			baseData[i] = sc.nextInt();
		}
	}
	private static void printArray(int[] array) {
		
		for(int i = 0; i<array.length; i++) 
			System.out.println(array[i]);
		//System.out.println();
	}
	
	private static void resizeArray() {

		int[] original = baseData;

		baseData = new int[12];
		for (int i = 0; i < original.length; i++) {
			baseData[i] = original[i];
		}
	}

}
