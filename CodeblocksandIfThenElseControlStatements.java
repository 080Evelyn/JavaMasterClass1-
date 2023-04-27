package day1;

public class CodeblocksandIfThenElseControlStatements {

	public static void main(String[] args) {
		
		
		 calculateScore(true, 800, 5, 100);
		 
		 calculateScore(true, 10000, 8, 200);
	
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("Your final score was = " +  finalScore);
			return finalScore;
			
	
			
			
		}
		return -1;
		
		
	}
	/*In the above, you are free to either use the variable name or their respective 
	value in the method name declaration.
	 */	
	
	//Also -1 is used conventionally in java to indicate error, invalid value or value not found.
	
}