package day1;

public class Door {
	private String shape;
	private Measurement measurement;
	private String colour;
	
	public Door(String shape, Measurement measurement, String colour) {
		this.shape = shape;
		this.measurement = measurement;
		this.colour = colour;
	}
	
	public void openDoor() {
		System.out.println("Door open!");
	}

	public String getShape() {
		return shape;
	}

	public Measurement getMeasurement() {
		return measurement;
	}

	public String getColour() {
		return colour;
	}
	
	
	
	
}
