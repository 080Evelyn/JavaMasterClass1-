package day1;

public class PlayerMain {

	public static void main(String[] args) {
		/*
		 * Player player = new Player(); player.name = "Tim"; player.health = 20;
		 * player.weapon = "Sword"; The new name is used in integration with the field
		 * whenever no constructor is created. But it is made possible only when the
		 * field is set to public.
		 * 
		 * player.health = 500; int damage = 22; player.loseHealth(damage);
		 * System.out.println("Player's remaining health = "+ player.remainingHealth());
		 */ 
		
		EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Weapon");
		System.out.println("Initial health is " + player.getHealth());
		}

}
