package Human;

import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private String ad;

    public Human(String ad, int years, LocalDate bday) {
        this.ad = ad;
        this.years = years;
        this.bday = bday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return years == human.years && bday == human.bday && Objects.equals(ad, human.ad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ad, years, bday);
    }

    public Human() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int bday() {
        return bday();
    }

    public void setDogumTarixi(LocalDate bday) {
        this.bday = bday;
    }

    private int years;
    private LocalDate bday;

}
