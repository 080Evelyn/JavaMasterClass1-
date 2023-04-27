package day1;

public class Main {

	public static void main(String[] args) {
		Car1 porsche = new Car1();		
		Motor tearRubber = new Motor();
		House mansion = new House();
		House fine = new House();
		porsche.setModel("Carrera");
		fine.setType("Bungalow");
		System.out.println("Model is "+ porsche.getModel());
		tearRubber.setTyre(4);
		System.out.println("Tear rubber "+ tearRubber.getTyre(0));
		mansion.setColour("Yellow and Brown");
		System.out.println("The colour of my house is "+ mansion.getColour());
		System.out.println("The house is a "+ fine.getType());
	}

}
