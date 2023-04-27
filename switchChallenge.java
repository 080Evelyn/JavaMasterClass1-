package day1;

public class switchChallenge {

	public static void main(String[] args) {
		char carly = 'A';
		switch (carly) {
		case 'A':
			System.out.println("A was found");
			break;
		case 'B':
			System.out.println("B was found");
			break;
		case 'C':
			System.out.println("C was found");
			break;
		case 'D':
			System.out.println("D was found");
			break;
		case 'E':
			System.out.println("E was found");
			break;
			default:
				System.out.println("Nothing was found");
				break;
		}
		String month = "FEBRUARY";
		switch (month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
		case "february":
			System.out.println("Feb");
			break;
			default:
				System.out.println("Not Sure");
				break;
		}
		}

}
