package day1;

public class ParsingExample {

	public static void main(String[] args) {
		String name = "2503";
		String number = "12.35";
		System.out.println("result = "+ name);
		float parsed = Float.parseFloat(name);
		
		name += 1;
		parsed += 1;
		System.out.println("result = "+ name);
		System.out.println("Int result = "+ parsed);
		
	}

}
