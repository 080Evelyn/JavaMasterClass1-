package day1;

public class DoWhileTest {

	public static void main(String[] args) {
		int Glo = 0;
		do {
			System.out.println(Glo);
			Glo++;
			if(Glo % 2 == 0) {
				System.out.println(Glo);
			}
			}
		while(Glo <= 11);
	
		
	}
	
}
