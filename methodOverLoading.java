package day1;

public class methodOverLoading {

	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(6, 0);
		calcFeetAndInchesToCentimeters(157);
		
	}
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if((feet <0)||(inches < 0)||(inches > 12)) {
			return -1;
		}
		double centimeters = feet * 2.54 * 12;
		centimeters += inches * 2.54;{
		System.out.println(centimeters + "cm equals "+ feet +" feet and "+ inches + "inches");
		}
		return centimeters;
		
		}
		
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches < 0) {
			
			return -1;
		}
		double feet = (int)inches/12;
		double remainingInches = (int)inches % 12;{
			System.out.println(inches + "inches equals "+ feet + "feet and " +remainingInches + "inches");
		}
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
		
		}

}
