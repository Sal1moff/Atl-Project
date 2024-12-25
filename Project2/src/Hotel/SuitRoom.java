package Hotel;

public class SuitRoom extends Room {
    @Override
    public void displayInfo() {
        System.out.println("Otaq nömresi:" + getRoomNumber()
                + " Otaq qiymeti:" + getPrice()
                + " Metbext varmi:"
                + (isKitchen ? " Var" : " Yoxdur"));
    }

    private boolean isKitchen;

    public SuitRoom(int roomNumber, double price,RoomTYpe roomTYpe) {
        super(roomNumber, price,roomTYpe);
        this.isKitchen = true;
    }
}
