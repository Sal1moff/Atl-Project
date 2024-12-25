package Hotel;

public class StandartRoom extends Room {
    private boolean isSingleBed;

    public StandartRoom(int roomNumber, double price,RoomTYpe roomTYpe) {
        super(roomNumber, price,roomTYpe);
        this.isSingleBed = true;
    }

    @Override
    public void displayInfo() {
        System.out.println("Otaq nömresi:" + getRoomNumber()
                + " Otaq qiymeti:" + getPrice()
                + " Yataq Sayi:"
                + (isSingleBed ? " This room is Singlebed Room" : "This room isnt Singlebed Room"));
    }
}
