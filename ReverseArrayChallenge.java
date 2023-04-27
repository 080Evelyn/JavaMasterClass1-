package day1;

import java.util.Arrays;

public class ReverseArrayChallenge {

	public static void main(String[] args) {
		int[] array = {5,9,17,89,34,88};
		System.out.println("Array = "+ Arrays.toString(array));
		reverse(array);
		System.out.println("Reversed Array = "+ Arrays.toString(array));
	}
	public static void reverse(int[] array) {
		int maxIndex = array.length-1;
		int halfLength = array.length/2;
		for(int i = 0; i<halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex-i];
			array[maxIndex-i] = temp;
		}
		
		
	}
}
