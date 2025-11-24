package tech.codoverse;

public class House {

    private String houseNo;
    private String color;
    // composition
    private Room room = new Room();

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getColor() {
        return color;
    }

    public Room getRoom() {
        return room;
    }
}
