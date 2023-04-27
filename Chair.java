package day1;

public class Chair {

	private String Material;
	private String colour;
	private int seater;
	
	public Chair(String Material,String colour, int seater) {
		this.Material = Material;
		this.colour = colour;
		this.seater = seater;
	}
	
	public void carryMan() {
		System.out.println("Sit on me");
	}
	public void chairPosition() {
		System.out.println("Rock the chair.");
	}

	public String getColour() {
		return colour;
	}

	public int getSeater() {
		return seater;
	}
	public String getMaterial() {
		return Material;
	}
	
	
	
	
}
