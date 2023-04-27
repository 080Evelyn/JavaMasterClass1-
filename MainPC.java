package day1;

public class MainPC {

	public static void main(String[] args) {
		Case theCase = new Case("210B","Acer","230", new Dimensions(20,20,5));
		Monitor monitor = new Monitor("15inch Beast","Lenovo",30, new Resolution(6,8));
		MotherBoard motherboard = new MotherBoard("BJ-251","HP",4,16,"v2.41");
		PC myPC = new PC(theCase,monitor,motherboard) ;
		myPC.powerUp();
		//myPC.getMotherboard().loadProgram("Window 10");
		//myPC.getMyCase().pressPowerButton();
	}
 
}
