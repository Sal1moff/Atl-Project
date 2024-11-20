package Car;

public class Car {
    public String color;
    public int year;
    public int speed;


    public Car(String color, int year, int speed) {
        this.color = color;
        this.year = year;
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }
    public void setYear(int year) {
        this.year = year;

    }

    public int getYear() {
        return year;
    }
    public void setSpeed(int speed) {
        this.speed = speed;

    }

    public int getSpeed() {
        return speed;
    }


}

