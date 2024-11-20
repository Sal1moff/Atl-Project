package miniCALC;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededleri daxil edin:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        int result = 0;

        Toplama toplama = new Toplama();
        Cixma cixma = new Cixma();
        Bolme bolme = new Bolme();
        Vurma vurma = new Vurma();
        if (c.equals("+")) {
            result = toplama.Topla(a,b);
            System.out.println(result);
        } else if (c.equals("-")) {
            result= cixma.Cix(a,b);
            System.out.println(result);
        }
        else if (c.equals("*")) {
            result= vurma.Vur(a,b);
            System.out.println(result);
        }
        else if (c.equals("/")) {
            result= bolme.Bol(a,b);
            System.out.println(result);
        }
        else{
            System.out.println("Emeliyyatda sehv");
        }

    }
}
