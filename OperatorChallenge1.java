package day1;

public class OperatorChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cocacola = 20.00;
		double fanta = 80.00;
		double pepsi = 100.00 * (cocacola + fanta);
		System.out.println(pepsi);
		double sprite = pepsi % 40.00;
		System.out.println(sprite);
		
		boolean  result = (sprite == 0) ? true : false;
			System.out.println(result);
			if (result) {
			System.out.println("Got Some Remainder");
			}
		
		}
	
	}


