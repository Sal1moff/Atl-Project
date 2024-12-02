package Trafficlight;

public class MainLight {
    public static void main(String[] args) {
        TRAFFICLIGHT lights=TRAFFICLIGHT.red;

        for (TRAFFICLIGHT light : TRAFFICLIGHT.values()){
            if (lights == light){
                System.out.println("Light is:"+light);
                System.out.println("Our action is:"+light.getMessage());
            }
        }



    }
}
