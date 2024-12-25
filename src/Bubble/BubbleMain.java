package Bubble;

import java.util.Arrays;

public class BubbleMain {
    public static void main(String[] args) {
        int[] reqemler = {1, 2, 6, 9, 1, 5, 123, 45};
        for (int i = 0; i < reqemler.length - 1; i++) {
            for (int j = 0; j < reqemler.length  - 1; j++) {

                if (reqemler[j] > reqemler[j + 1]) {
                    int taslak = reqemler[j ];
                    reqemler[j] = reqemler[j+1];
                    reqemler[j+1] = taslak;

                }


            }
        }
        for (int a : reqemler) {
            System.out.println(a);
        }
    }
}
