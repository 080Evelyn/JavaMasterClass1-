package day1;

public class RevisionClass {

	public static void main(String[] args) {
		System.out.println(getDurationString(7545));
		System.out.println(getDurationString(125,45));
	}

	public static String getDurationString(int seconds) {
		if(seconds < 0) {
			System.out.println("Sorry! It is negligible.");
		}
		else {
			System.out.println((seconds/3600) + "h " +   (seconds % 3600)/60 + "m " + (seconds % 60) + "s");
		}
		int minutes = 0;
		return getDurationString(minutes,seconds);
	}

	public static String getDurationString(int minutes, int seconds) {
		if(seconds < 0 || minutes < 0) {
			System.out.println("Invalid!");
		}
		return (seconds / 3600 + (minutes / 60)) + "h " + ((seconds % 3600) / 60 + minutes % 60) + "m " + (seconds % 60) + "s";
	}
}
