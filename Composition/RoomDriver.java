package Composition;



public class RoomDriver {
	public static void main(String[] args) {
		Room room = new Room(600);
		
		House house = new House("Blue",600);
		System.out.println(house.getColor());
		System.out.println(house.getRoom().getArea());
		house=null;
		System.out.println(house.getRoom().getArea());


		
	}

}
