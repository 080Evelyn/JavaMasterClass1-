package day1;

public class retail_shop {

	public static void main(String[] args) {
		int courseA = 80, courseB = 75, courseC = 50;
		double GPA = ((courseA * 2)+(courseB)+(courseC *3)) ;
		GPA = GPA*.0083;
		
		int result = johnPrice(91, 80, 75);
		result = johnPrice(35, 90, 50);
		
	
		johnPrice(91, 80, 75);
		johnPrice(35, 90, 50);
		johnPrice(40, 50, 57);
		johnPrice(56, 49, 90);
		johnPrice(80, 58, 71);
		johnPrice(72, 45, 83);
		johnPrice(71, 91, 34);
		johnPrice(78, 65, 50);
		{
			System.out.println(GPA);
			
			
		}
	
		

	}
	public static int johnPrice (int courseA, int courseB, int courseC) {
		double GPA = (.0083 *((courseA*2)+(courseB)+(courseC*3))) ; 
			
	       // System.out.println("Mary's GPA =" + GPA);}
		//{
			//System.out.println("Joe's GPA =" + GPA);}
		/*
		 * { System.out.println("Gabriel's GPA = " + GPA);} {
		 * System.out.println("Kadija's GPA =" + GPA);} {
		 * System.out.println("Ben's GPA =" + GPA);} { System.out.println("Rose's GPA ="
		 * + GPA);
		 * 
		 * 
		 * }
		 */
		return -1;
			
		
		
	
	}
}
