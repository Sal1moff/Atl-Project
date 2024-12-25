

import javax.lang.model.type.NullType;
import java.util.*;

public class Lesson1 {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a>b:" + (a > b) +
                " ,a<b:" + (a < b) +
                " ,a=b:" + (a == b) +
                " ,a=!b:" + (a != b) +
                " ,a<=b:" + (a <= b) +
                " ,a>=b:" + (a >= b));
*/
/*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int yuzluk = (a - (a % 100)) / 100;
        int onluq = (a % 100) / 10;
        int teklik = a - ((onluq * 10 + (yuzluk * 100)));
        int toplama = teklik + onluq + yuzluk;
        int hasil = teklik * onluq * yuzluk;
        int ferq = teklik - onluq - yuzluk;
        System.out.println("ededimizin tekliyi:" + teklik + " ,onlugu:" + onluq + " ,yüzlüyü ise:" + yuzluk + " ,cemi:" + toplama + " ,ferqi:" + ferq + " ,hasili:" + hasil);
  */
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int aylar=a*12;
        System.out.println(a+"yas aylarla "+aylar+"-a beraberdir");*/

        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean c=a==b;


        System.out.println("a ededi b ededine beraberdir: "+c);*/

/*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int yuzluk = (a - (a % 100)) / 100;
        int onluq = (a % 100) / 10;
        int teklik = a - (((onluq * 10) + (yuzluk * 100)));
        int newYuzluk = teklik * 100;
        int newOnluq = onluq * 10;
        int newTeklik = yuzluk;
        int newEded = newYuzluk + newOnluq + newTeklik;
        System.out.println(" ededimiz:" + a + " ,yeni ededimiz:" + newEded);
*/
/*
        Scanner sc = new Scanner(System.in);
        int eded = sc.nextInt();
        int minlik = eded / 1000;
        int yuzluk = (eded / 100) % 10;
        int onluq = (eded / 10) % 10;
        int teklik = eded % 10;
        int reverse = (teklik * 1000) + (yuzluk*100 ) + (onluq*10 ) + (minlik);

        System.out.println(reverse+10);*/
/*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first=num/100;
        int last=num%10;
        boolean result=first==last;
        System.out.println("eded polindromdur:"+result);*/
/*
        String s5 = "34";
        int a=34;
        int v = Integer.parseInt(s5);
        System.out.println(v + 5);
*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int num = sc.nextInt();
        boolean e = (num%3==0 && num%4==0 ) == true;
        System.out.println("number is dividing both of 3 and 4:" + e);*/

/*
        var username = "admin";
        var password = "admin";
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if (username.equals(a)) {
            if (password.equals(b)) {
                System.out.println("Welcome");
            } else {
                System.out.println("Username or Password is wrong");
            }
        } else {
            System.out.println("User not found");
        }

*/

//task1 if
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int num = sc.nextInt();
        if (num % 4 == 0 && num % 6 == 0) {
            System.out.println("Ededimiz 4 ve 6-a qaliqsiz bölünür");
            ;
        } else {
            System.out.println("Ededimiz bölünmür");
        }
        */

        //task2 if

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int num = sc.nextInt();
        if (num % 3 == 0 || num % 4 == 0) {
            System.out.println("Ededimiz 3 ve ya 4-e  bölünür");
            ;
        } else {
            System.out.println("Ededimiz  bölünmür");
        }
*/
        //task3 if
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Balinizi daxil edin:");
        int num = sc.nextInt();
       if (num>90){
           System.out.println("Sizin imtahan neticeniz A");
       } else if (num>80) {
           System.out.println("Sizin imtahan neticeniz B");
       }
       else if (num>70) {
           System.out.println("Sizin imtahan neticeniz C");
       }
       else if (num>60) {
           System.out.println("Sizin imtahan neticeniz D");
       }
       else if (num>50) {
           System.out.println("Sizin imtahan neticeniz E");
       }
       else{
           System.out.println("Sizin imtahan neticeniz F");
       }

*/

/*
//task4 switch case
        Scanner sc = new Scanner(System.in);
        System.out.println("Ayi daxil edin:");
        String months = sc.next();
        switch (months) {
            case "Dekabr":
            case "Fevral":
            case "Yanvar":
                System.out.println("Qis Fesli");
                break;
            case "Mart":
            case "Aprel":
            case "May":
                System.out.println("Yaz Fesli");

                break;
            case "Iyun":
            case "Iyul":
            case "Avqust":
                System.out.println("Yay Fesli");

                break;
            case "Sentyabr":
            case "Oktyabr":
            case "Noyabr":
                System.out.println("Payiz Fesli");

                break;
            default:
                System.out.println("Zehmet olmasa ayi dogru daxil edin");
                break;
        }

*/
        //task5 mini calc
/*

        Scanner sc = new Scanner(System.in);
        System.out.println("Ededleri daxil edin:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Etmek istediyiniz emeliyyati daxil edin");
        String a = sc.next();
        if (a.equals("+")) {
            System.out.println("neticeniz:" + (num1 + num2));
        } else if (a.equals("-")) {
            System.out.println("neticeniz:" + (num1 - num2));

        } else if (a.equals("*")) {
            System.out.println("neticeniz:" + (num1 * num2));

        } else if (a.equals("/")) {
            System.out.println("neticeniz:" + (num1 / num2));

        } else {
            System.out.println("Emeliyyatda sehv");
        }
*/
/*
        //task 6 endirim

        Scanner sc = new Scanner(System.in);
        System.out.println("Yekun meblegi daxil edin:");
        int num = sc.nextInt();
        int endrm;
        if(num<=300){
            endrm=5;
        } else if (num<=500) {
            endrm=7;
        } else if (num<=1000) {
            endrm=10;
        }
else {
    endrm=12;
    }
num=num-((num*endrm)/100);
        System.out.println("Sizin ednirim faiziniz: "+endrm+" Ve endirim sonrasi Ödenisiniz: "+num);



*/
        //task 7 eded müsbetdirmi
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Ededimiz müsbetdir!");
        } else if (num<0) {
            System.out.println("Ededimiz menfidir!");
        }
        else{
            System.out.println("Ededimiz sifirdir");
        }

*/
        //task 8 hefte günleri
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
                System.out.println("Cersenbe axsami");
                break;
            case 3:
                System.out.println("Cersenbe");
                break;
            case 4:
                System.out.println("Cüme axsami");
                break;
            case 5:
                System.out.println("Cüme");
                break;
            case 6:
                System.out.println("Senbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Zehmet olmasa 1-7 arasi reqem daxil edin!");
                break;
        }

 */
        //task9 leap year
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ili daxil edin:");
        int num = sc.nextInt();
        if(num%4==0){
            System.out.println("Bu il fevral ayi 29 gündür:");
        }
        else {
            System.out.println("Bu il fevral ayi 28 gündür.");
        }

*/

        /*
        var a=3;
        var b=5;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+","+b);

         */

        /*
        int num = 1;
        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.println("eded cütdür:" + num);
            } else {
                System.out.println("eded tekdir:" + num);
            }
            num++;
        }
*/

/*
        for (var a = 1; a <= 10; a++) {
            for (var b = 1; b <= 10; b++) {
                System.out.println(a + " * " + b + " = " + (a * b));

            }
        }

 *//*
        for(var a=1;a<=10;a++){
            for(var b=10;b>0;b--){
                System.out.println(a+"."+b);
            }
        }
        *//*
        int[] box={1,4,7};
        for(var a=box.length-1;a>=0;a--){
            System.out.println(box[a]);
            */
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Arrayin uzunlugunu daxil edin:");
        int arrayUzunlug = sc.nextInt();
        double sum = 0;
        double average = 0;
        int[] ededler = new int[arrayUzunlug];
        for (int i = 0; i < ededler.length; i++) {
            System.out.println("Arrayin " + i + "-ci elementini daxil edin: ");
            ededler[i] = sc.nextInt();
            sum += ededler[i];

        }
        int intSum=(int)sum;
        average = sum / arrayUzunlug;
        System.out.println("arrayin elementleri cemi: "+(intSum)+" ,ortalamasi: "+average);


 */
/*
        Scanner sc=new Scanner(System.in);
        int[] ededler=new int[5];
        int min;
        int max;
        for(int i=0;i< ededler.length;i++){
            System.out.println("Arrayin "+i+"-ci elementini daxil edin: ");
            ededler[i]= sc.nextInt();

        }
        min=ededler[0];
        max=ededler[0];
        for(int j=1;j< ededler.length;j++){
            if(ededler[j]<min){
                min=ededler[j];
            }


        }
        for(int k=1;k<ededler.length;k++){
            if(ededler[k]>max){
                max=ededler[k];
            }
        }
        System.out.println(min+" "+max);

 */

/*

        Scanner sc=new Scanner(System.in);
        int[] ededler=new int[5];


        for(int i=0;i< ededler.length;i++){
            System.out.println("Arrayin "+i+"-ci elementini daxil edin: ");
            ededler[i]= sc.nextInt();

        }
        System.out.println(Arrays.toString(ededler));


 */
        /*
       for(var i=0;i<5;i++){
           for(var j=0;j<5;j++){
               System.out.println(i+"."+j);
               break;
           }
       }

         */
/*
        var animal = new Animal();
        animal.setName("example");
        System.out.println(animal.getName());


 */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Arrayin ölcüsünü daxil edin");
        int size = sc.nextInt();
        System.out.println("------------------");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        System.out.println("Yeni arrayin ölcüsünü daxil edin");
        int newSize = sc.nextInt();
        System.out.println("------------------------------");
        int[] newArr = new int[newSize];
        for (int j = 0; j < newSize; j++) {
            if (j < size) {
                newArr[j] = arr[j];
            } else {
                System.out.println("Yeni element daxil edin:");
                newArr[j] = sc.nextInt();
            }
        }
        System.out.println("------------------");
        for(int num:arr){
            System.out.println(num+" ");
        }
        System.out.println("-----------------------------------");
        for(int num:newArr){
            System.out.println(num+" ");
        }

 */

//        Integer x=128;
//        int y=128;
//        boolean a=x==y;
//        System.out.println(a);
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("String daxil edin:");
        String a = sc.nextLine();


        try {
            if (a.isEmpty()) {
                throw new NullPointerException("boslug olmaz");
            }
            System.out.println("You enter: " + a);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }



 */


//        System.out.println("helooooooooooooooooooooo");

//
//        int[] ededler={1,2,3,6,7,8};
//        int a=5;
//        String[] texts={"huseyn","eli","vali","raul"};
//        System.out.println("minimum is:" +Arrays.stream(ededler).min().getAsInt());
//        System.out.println("maximum is:"+ Arrays.stream(ededler).max().getAsInt());
//        System.out.println("Summary is:"+ Arrays.stream(ededler).sum());
//        System.out.println("Average is:"+ Arrays.stream(ededler).average().getAsDouble());
//        Collections.reverse(Arrays.asList(ededler));
//        Arrays.sort(texts);
//       for(String d:texts)
//       {
//           System.out.println(d);}

//        LinkedList<String> names = new LinkedList<String>();
//        ArrayList<String> maxLengt = new ArrayList<String>();
//        names.add("emin");
//        names.add("ali");
//        names.add("vali");
//        names.add("xanbala");
//        names.add("huseyin");
//        String name=names.getFirst();
//        for (String a : names) {
//            if (a.length() > name.length()  )   {
//                name = a;
//
//            }
//
//
//        }
//
//
//        System.out.println(name + "," + name.length());

//
//        Map<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(1, "Apple");
//        hashMap.put(2, "Banana");
//        hashMap.put(1, "Orange"); // Aynı anahtar üzerine yazılır.
//        System.out.println("HashMap: " + hashMap);
//
//        // LinkedHashMap
//        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put(1, "Apple");
//        linkedHashMap.put(2, "Banana");
//        System.out.println("LinkedHashMap: " + linkedHashMap);
//
//        // TreeMap
//        Map<Integer, String> treeMap = new TreeMap<>();
//        treeMap.put(2, "Banana");
//        treeMap.put(1, "Apple");
//        System.out.println("TreeMap: " + treeMap);
//

        System.out.println("hello");

    }

}


