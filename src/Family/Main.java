package Family;

public class Main {
    public static void main(String[] args) {
        Family adam = new Family();
        Human human1 = new Human("elovset", "Eliyev", 22, 80, "mom", "fath", new Pet());

        var a = human1.getFather();

        System.out.println(a);


    }
}
