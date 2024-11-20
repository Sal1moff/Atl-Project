package Car;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("grey", 2022, 280);
        Mercedes merc = new Mercedes("Yellow", 2020, 300);
        Audi audi = new Audi("red", 2020, 250);
        Ferrari ferrari = new Ferrari("black", 2019, 300);
        var a = bmw.comfortly();
        var b = merc.color;
        var c = audi.speed;
        var d = ferrari.year;
        System.out.println("speciality: " + a);
        System.out.println("color: " + b);
        System.out.println("speed: " + c);
        System.out.println("year: " + d);

    }
}
