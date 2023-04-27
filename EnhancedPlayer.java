package day1;

public class EnhancedPlayer {
	private String name;
	private int hitpoint = 100;
	private String weapon;
	
	public EnhancedPlayer(String name, int health, String weapon) {
		this.name = name;
		
		if(health > 0 && health < 100) {
		this.hitpoint = health;
		}
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return hitpoint;
	}

	public String getWeapon() {
		return weapon;
	}
}
