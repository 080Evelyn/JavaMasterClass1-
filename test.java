package day1;

public class test {

	public static void main(String[] args) {
		int newScore = calculateScore("Tim", 500);
		System.out.println("Tim scored " + newScore);
		System.out.println("   ");
		
		 moneyConverter(250);
		 moneyConverter(300);
		 moneyConverter(470);
		

	}
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score);
	
		
	
	return score * 1000;
	}

	public static double moneyConverter(int kobo) {
		int naira = kobo / 100;
		int koboRemainder = kobo % 100;
		System.out.println(kobo + "kobo = N" +naira +"." + koboRemainder + "kobo");
		
		return -1;

	}
	
}
