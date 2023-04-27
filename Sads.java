package day1;

public class Sads {

	public static void main(String[] args) {
		int number = 235014;
		if(number < 0) {
			System.out.println("Invalid Value");
		}
		int reversed = reverse(number);
		for(int i = 0; i < getDigitCount(number); i++) {
		switch(reversed % 10) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
			
		}
		reversed /= 10;
		}

	System.out.println();
	}
	public static int reverse(int number) {
		 int reversed = 0;
		 while(number != 0) {
		 reversed = (reversed * 10) + (number % 10);
		 number /= 10;
		 }
		 return reversed; 
	}
	public static int getDigitCount(int number) {
		if(number < 0) {
			return -1;
		}
		int count = 1;
		while(number > 9) {
			number /= 10;
			count++;
		}
		return count;
	}

}
