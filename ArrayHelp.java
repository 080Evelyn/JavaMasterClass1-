package day1;

import java.util.Scanner;
public class ArrayHelp {

	public static void main(String[] args) {
		
		double invoice[][] = new double[15][2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("Enter the value");
				invoice[i][j] = sc.nextDouble();
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println(invoice[i][j]);
				
			}
		}

	}

}
