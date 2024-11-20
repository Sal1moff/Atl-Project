package Car;

public class Ferrari extends Car{
    public Ferrari(String color,int year,int speed){
        super("black",2019,300);
    }

    public String price(){
        return "expensive more than others";
    }
}
