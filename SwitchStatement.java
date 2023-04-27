package day1;

public class SwitchStatement {

	public static void main(String[] args) {
			int biggy = 5;
		switch (biggy) {
		case 0:
			System.out.println("biggy is 0");
			break;
		case 1:
			System.out.println("biggy is 1");
			break;
		case 3:
		case 4:
			System.out.println("biggy is close");
			break;
		default:
			System.out.println("bigger is equal or exceeds");
			break;
		}

	}
}