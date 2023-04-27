package day1;
class Car1{
	private String name;
	private boolean engine;
	private int cylinder;
	private int wheels;
	
	public Car1(String name, int cylinder) {
		this.name = name;
		this.engine = true;
		this.cylinder = cylinder;
		this.wheels = 4;
		
	}
	public String getName() {
		return name;
	}
	
	public int getCylinder() {
		return cylinder;
	}
	
	public String accelerate() {
		return "Car -- accelerate";
	}
	public String brake() {
		return "Car -- brake";
	}
	public String startEngine() {
		return "Car -- start engine \n";
	}
}

class Mitsubish extends Car1{

	public Mitsubish(String name, int cylinder) {
		super(name, cylinder);
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() +" accelerate";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() +" brake";
	}
	
	@Override
	public String startEngine() {
		return getClass().getSimpleName() +" start engine \n";
	}
}

class Nissan extends Car1{

	public Nissan(String name, int cylinder) {
		super(name, cylinder);
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() +" -- accelerate";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() +" -- brake";
	}
	
	@Override
	public String startEngine() {
		return getClass().getSimpleName() +" start engine \n";
	}
}

class Elim extends Car1{

	public Elim(String name, int cylinder) {
		super(name, cylinder);
	}
	@Override
	public String startEngine() {
		return getClass().getSimpleName() +" start engine \n";
	}

	@Override
	public String accelerate() {
		return "Elim -- accelerate";
	}

	@Override
	public String brake() {
		return "Elim -- brake";
	}
}


public class PolymorphismChallenge {

	public static void main(String[] args) {
		
		Car1 car = new Car1("Base car",8);
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		System.out.println(car.startEngine());
		
		Mitsubish mitsh = new Mitsubish("Coaster bus",6);
		System.out.println(mitsh.accelerate());
		System.out.println(mitsh.brake());
		System.out.println(mitsh.startEngine());
		
		Nissan nissan = new Nissan("Luxirous bus",8);
		System.out.println(nissan.accelerate());
		System.out.println(nissan.brake());
		System.out.println(nissan.startEngine());
		
		Elim elim = new Elim("Jeep",4);
		System.out.println(elim.accelerate());
		System.out.println(elim.brake());
		System.out.println(elim.startEngine());
		
		Ford ford = new Ford("Ford Falcon",4);
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		System.out.println(ford.startEngine());
	}

}
