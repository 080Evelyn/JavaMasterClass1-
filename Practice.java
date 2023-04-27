package day1;

import java.util.*;
public class Practice {

	public static void main(String[] args) {
		double invoice[][] = new double[3][4];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Enter the value");
				invoice[i][j] = input.nextDouble();
				System.out.println(invoice[i][j]);
			}
			
		}
		
		  for (int i = 0; i < 3; i++) { for (int j = 0; j < 4; j++) {
		  System.out.println(invoice[i][j]); } }
		 
	}

}
