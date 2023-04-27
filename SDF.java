package day1;

public class SDF {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(12,30));
		System.out.println(getGreatestCommonDivisor(60,25));
	}
		 public static int getGreatestCommonDivisor(int first, int second) {
		//PLS STUDY THOROUGHLY.	 
		        if (first < 10 || second < 10) {
		            return -1;
		        }
		        while (first != second) {
		            if (first > second)
		                first = first - second;
		            else {
		                second = second - first;
		            }
		        }
		        return first;
		    }
}
