package day1;
//printing multiple lines of text with a single statement.

public class textbook {
	
	public static void main(String[] args) {
		System.out.println("Welcome\nto\nJava\nprogramming!");
		
		System.out.println("**\n**\n**\n**");
		
		
		System.out.printf("%s%n%s%n%s%n%s%n", 
				 "Welcome to", "Java Programming!", "Am Happy to learn Java!", "It's very interesting!");
		System.out.println();
		
		System.out.println("Hello World!\nAm in you but not of you.\n"
				+ "Am a child of God in heaven\n");
		
           short small = Short.MAX_VALUE ;
		
		int biggy = Integer.MAX_VALUE ;
		double firstResult =  ((small) * 10 ^ -3);
		double otherResult =  ((biggy) * 10 ^ -3);
		
		if(firstResult == otherResult) {
			System.out.println("HEY");
		}
		else {
			System.out.println("SHH");
		}
		
		}

}
