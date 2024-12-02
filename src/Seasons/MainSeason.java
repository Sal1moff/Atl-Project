package Seasons;

public class MainSeason {


    public static void main(String[] args) {
        SEASONS fesil1 = SEASONS.Summer;
        SEASONS fesil2 = SEASONS.Winter;

        for (SEASONS fesil : SEASONS.values()) {
            if (fesil == fesil1) {
                System.out.println(fesil.getInfo());
            }
        }
    }
}
