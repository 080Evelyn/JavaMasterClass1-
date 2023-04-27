package day1;

public class PC {
	private Case myCase;
	private Monitor monitor;
	private MotherBoard motherboard;
	
	public PC(Case myCase, Monitor monitor, MotherBoard motherboard) {
		this.myCase = myCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp() {
		getMyCase().pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		getMonitor().drawPixelAt(1200, 50, "yellow");
	}
	private Case getMyCase() {
		return myCase;
	}

	private Monitor getMonitor() {
		return monitor;
	}

	private MotherBoard getMotherboard() {
		return motherboard;
	}

}
