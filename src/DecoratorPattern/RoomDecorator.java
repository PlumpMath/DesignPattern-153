/**
 * 
 */
package DecoratorPattern;

/**
 * @author Toufiq
 *
 */
public class RoomDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room = new SimpleRoom();
		room.roomColor();
		
		System.out.println("*************");
		
		Room room1 = new ColorRoom(new SimpleRoom());
		room1.roomColor();
		
		System.out.println("*************");
		
		Room room2 = new CurtainRoom(new ColorRoom(new SimpleRoom()));
		room2.roomColor();

	}

}

interface Room{
	public void roomColor();
}

class SimpleRoom implements Room{

	@Override
	public void roomColor() {
		// TODO Auto-generated method stub
		System.out.println("This is Simple Room");
	}
	
}

class DecorateRoom implements Room{
	
	Room _Room;
	
	public DecorateRoom(Room room) {
		// TODO Auto-generated constructor stub
		_Room = room;
	}

	@Override
	public void roomColor() {
		// TODO Auto-generated method stub
		_Room.roomColor();
	}
	
}

class ColorRoom extends DecorateRoom{

	public ColorRoom(Room room) {
		super(room);
		// TODO Auto-generated constructor stub
	}
	public void roomColor() {
		// TODO Auto-generated method stub
		_Room.roomColor();
		System.out.println("This is Color Room");
	}
}

class CurtainRoom extends DecorateRoom{

	public CurtainRoom(Room room) {
		super(room);
		// TODO Auto-generated constructor stub
	}
	public void roomColor() {
		// TODO Auto-generated method stub
		_Room.roomColor();
		System.out.println("This is Curtain Room");
	}
}
