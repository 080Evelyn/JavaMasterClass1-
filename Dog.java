package day1;

public class Dog extends Animal {
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, String coat, int teeth, int tail) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	private void chew() {
		System.out.println("Dog.chew() called");
	}
	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
	}
	public void walk() {
		System.out.println("Dog.walk called");
		super.move();
	}
	public void run() {
		System.out.println("Dog.run called");
		move();
	}
	public void moveLegs() {
		System.out.println("Dog.moveLegs called");
	}
	@Override
	public void move() {
		System.out.println("Dog.moveLegs 1 called");
		moveLegs();
		super.move();
	}
}