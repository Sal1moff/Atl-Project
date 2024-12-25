package Hotel;

public class HotelMain {
    public static void main(String[] args) {
//        StandartRoom standartRoom = new StandartRoom(34, 150);
//        SuitRoom suitRoom = new SuitRoom(45, 200);
//        DeluxeRoom deluxeRoom = new DeluxeRoom(57, 250);
        Room[] rooms = new Room[3];

//        standartRoom.Reserve();
//        suitRoom.Reserve();
//        suitRoom.CancelReserve();
//        deluxeRoom.Reserve();
        Room room1 = new Room(100, 250, RoomTYpe.SUITE);
        Room room2 = new Room(100, 250, RoomTYpe.STANDARD);
        Room room3 = new Room(100, 250, RoomTYpe.DELUXE);
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        for (Room room : rooms) {
            if (room.isBooked()) {
                room.displayInfo();
            }
        }
        room1.displayInfo();
    }
}
