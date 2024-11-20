package Car;

public class Mercedes extends Car{
    public Mercedes(String color,int year,int speed){
        super("yellow",2020,300);
    }

    public String speedy(){
        return "Speedy more than others";
    }
}
