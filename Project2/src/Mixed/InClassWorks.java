package Mixed;

public class InClassWorks {
    public String ad;
    public String soyad;
    public int yas;

    public InClassWorks(String ad, String soyad, int yas) {
        System.out.println("Ich bin construktor");
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;
    }

    public int Yazdir(int a, int b) {
        int sonuc = a + b;
        return sonuc;
    }
}
