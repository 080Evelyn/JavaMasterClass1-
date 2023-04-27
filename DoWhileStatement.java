package day1;

public class DoWhileStatement {

	public static void main(String[] args) {

		int count = 1 ;
		do {
			System.out.println("Number counting " + count);
			count++;

			/*
			 * if (count >= 2 && count % 2 == 0) {
			 * 
			 * }
			 */
		} while (count != 8);

		int Olix = 1;
		int Alixir = 20;
		int sum = 0;
		while (Olix <= Alixir) {
			Olix++;

			if (!isEvenNumber(Olix)) {
				continue;

			}

			System.out.println("Even Number " + Olix);
			sum++;
			if (sum >= 5) {
				break;
			}

		}
		System.out.println("Sum = " + sum);

	}

	public static boolean isEvenNumber(int evenNumber) {
		if (evenNumber % 2 == 0) {
			return true;
		} else {
			return false;

		}
	}

}
