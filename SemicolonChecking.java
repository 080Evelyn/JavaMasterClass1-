package day1;

public class SemicolonChecking {

	public static void main(String[] args) {

		briefSolution(50, 20);
		briefSolution(80, 30);
		briefSolution(100, 25);
		int newAnswer = briefSolution(50, 20);
		System.out.println("My new answer = " + newAnswer);
		}
	public static int briefSolution(int Akinola, int Tolulope) {
		int totalCost = (Akinola +Tolulope);
		int subtractedCost = (Akinola - Tolulope);
		 System.out.println(totalCost +" is my answer "
				  + " while my reduced answer is " + subtractedCost  );
		 return totalCost * 1000;
		 
		}
		
}		
  




	

