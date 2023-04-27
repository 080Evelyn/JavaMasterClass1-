package day1;

public class Room {
	
	private Tiles tiles;
	private Chair chair;
	private Door door;
	
	
	
	public Room(Tiles tiles, Chair chair, Door door) {
		this.tiles = tiles;
		this.chair = chair;
		this.door = door;
	}

	public void entrance() {
		getDoor().openDoor();
		viewRoom();
	}
	
	private void viewRoom() {
		getTiles().stepOn();
		getChair().carryMan();
		getChair().chairPosition();
	}

	public Tiles getTiles() {
		return tiles;
	}

	public Chair getChair() {
		return chair;
	}

	public Door getDoor() {
		return door;
	}

	
}
