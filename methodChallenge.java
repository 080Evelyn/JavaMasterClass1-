package day1;

public class methodChallenge {

	public static void main(String[] args) {
		
		int highScorePosition = calculateHighScorePosition(1000);
		displayHighScore(" Monica", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScore(" Lasbrey", highScorePosition);
		
	    highScorePosition = calculateHighScorePosition(400);
		displayHighScore(" Francis", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScore(" Wilson", highScorePosition);
			
				
				}
					
	public static void displayHighScore(String playerName,int highScorePosition) {
		System.out.println(playerName + " managed to get into position " 
				+ highScorePosition + " on the high score table");
		
		
		
	}
	public static int calculateHighScorePosition(int playerScore) {
	/*	if( playerScore > 1000) {
			return 1;
		}if(playerScore >500 && playerScore <1000) {
			return 2;
		}if(playerScore >100 && playerScore < 500) {
			return 3;
		}else {
			return 4;*/   
		
		//OR
		
		int position = 4;
		if(playerScore >= 1000) {
			position = 1;
		} else if(playerScore > 500 && playerScore < 1000) {
				position = 2;
		} else if(playerScore > 100 && playerScore < 500) {
					position = 3;
		} else
		{
			position = 4;
		}
			return position ;
		
	}
}
