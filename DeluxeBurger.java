package day1;

public class DeluxeBurger extends Harmburger{

	public DeluxeBurger() {
		super("Deluxe", "Sausage & Bacon", 14.54, "White");
		super.addLettuce("Chips", 2.75);
		super.addTomatoes("Drink", 1.81);
	}

	@Override
	public void addLettuce(String name, double price) {
		System.out.println("Can not add additional items to a deluxe burger");
	}

	@Override
	public void addTomatoes(String name, double price) {
		System.out.println("Can not add additional items to a deluxe burger");
		}

	@Override
	public void addCarrot(String name, double price) {
		System.out.println("Can not add additional items to a deluxe burger");
		}

	@Override
	public void addCheese(String name, double price) {
		System.out.println("Can not add additional items to a deluxe burger");
		}
	
	

}
