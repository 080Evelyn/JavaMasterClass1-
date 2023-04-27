package day1;

public class SecondsMinuteChallenge {

	public static void main(String[] args) {
		getDurationString(65,0);
		getDurationString(-5);
		
	}
	public static String getDurationString(int minutes, int seconds) {
		if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
			System.out.println("Invalid");
			return "Invalid";
		}
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		
		System.out.println(hours + "hr "+ remainingMinutes + "m " + seconds + "s" );
		return hours + "hr "+ remainingMinutes + "m " + seconds + "s";
		}
	
	public static String getDurationString(int seconds) {
		if(seconds < 0) {
			System.out.println("Invalid");
			return "Invalid";
		}else {
		
		int minutes = seconds/60;
		int secondsRemaining = seconds % 60;{
		}
		return getDurationString(minutes, secondsRemaining);
		}
		
	}
	
}
