package day1;

import java.util.Scanner;

public class ArrayYoutube2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		
		int count = 0;
		while(x != 10) {
			System.out.println("Type 10....");
			System.out.println("Enter a number: ");
			x = sc.nextInt();
			count++;
		}
		System.out.println("You have entered 10, after " + count + " trials.");
	}

}
