public class FirstClass{
    public String name(String name){
        return name;
    }

    public static void main(String[] args) {
        var objecthuman=new FirstClass();
        var result=objecthuman.name("ali");
        var result2=objecthuman.name("ali");
        var result3=objecthuman.name("ali");
        var result4=objecthuman.name("ali");
        System.out.println(result2);
    }
}