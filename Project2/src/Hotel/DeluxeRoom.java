package Hotel;

public class DeluxeRoom extends Room {
    private boolean isBalcony;

    public DeluxeRoom(int roomNumber, double price,RoomTYpe roomTYpe) {
        super(roomNumber, price,roomTYpe);
        this.isBalcony = true;
    }

    @Override
    public void displayInfo() {
        System.out.println("Otaq nömresi:" + getRoomNumber()
                + " Otaq qiymeti:" + getPrice()
                + " Balkon Varmi:"
                + (isBalcony ? " Var" : " Yoxdur"));
    }
}
