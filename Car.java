package day1;

public class Car extends Vehicle {
	private int doors;
	private int wheels;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	public Car(String name, String size, int currentVelocoty, int currentDirection, int doors, int wheels, int gears,
			boolean isManual, int currentGear) {
		super(name, size, currentVelocoty, currentDirection);
		this.doors = doors;
		this.wheels = wheels;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("car.setCurrentGear(): changed to " + currentGear + " gear.");
	}
	public void changeVelocity(int speed, int direction) {
		move(speed, direction);
		System.out.println("car.changeVelocity(): velocity " + speed + " direction "+ direction);
	}
	
}
