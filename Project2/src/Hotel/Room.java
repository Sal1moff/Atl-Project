package Hotel;

public class Room {
    private int roomNumber;
    private double price;
    private boolean isBooked;
    private final RoomTYpe roomType;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomTYpe getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", price=" + price +
                ", isBooked=" + isBooked +
                '}';
    }

    public Room(int roomNumber, double price,RoomTYpe roomType) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = true;
        this.roomType=roomType;

    }

    public void displayInfo() {

    }



    public void Reserve() {
        if (isBooked) {
            System.out.println(roomNumber + " nömreli otaq rezerv olundu");
            isBooked = false;
        } else {
            System.out.println(roomNumber + " nömreli otaq artiq reserv olunub");
        }
    }

    public void CancelReserve() {
        if (!isBooked) {
            System.out.println(roomNumber + " nömreli otag reservi legv olundu");
            isBooked = true;
        } else {
            System.out.println("Reserv tapilmadi");
        }
    }
}
