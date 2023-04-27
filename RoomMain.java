package day1;

public class RoomMain {

	public static void main(String[] args) {
		Tiles tiles = new Tiles("Square",new Measurement(5,5));
		Chair chair = new Chair("Leather", "Black",4);
		Door door = new Door("Rectangle", new Measurement(200,35), "Dark Grey");
		Room myRoom = new Room(tiles, chair, door);
		myRoom.entrance();

	}

}
