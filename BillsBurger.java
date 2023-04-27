package day1;

public class BillsBurger {

	public static void main(String[] args) {
		Harmburger harmburger = new Harmburger("Basic", "White", 3.50, "Sausage");
		double price = harmburger.itemizedHarmburger();
		harmburger.addLettuce("lettuce", 0.2);
		harmburger.addTomatoes("tomatoes", .85);
		harmburger.addCarrot("carrot", 1);
		harmburger.addCheese("cheese", .50);
		System.out.println("Total burger price is " +harmburger.itemizedHarmburger());

		HealthyBurger healthyBurger = new HealthyBurger(8, "Bacon");
		healthyBurger.addLettuce("Egg", 3.8);
		healthyBurger.addHealthy1Name("Lentils", 4.3);
		System.out.println("Total Healthy Burger price is " + healthyBurger.itemizedHarmburger());
		
		DeluxeBurger db = new DeluxeBurger();
		db.addCarrot("Should not do this",50.53);
		db.itemizedHarmburger();
	}

}
