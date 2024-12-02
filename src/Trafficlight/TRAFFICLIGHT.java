package Trafficlight;

public enum TRAFFICLIGHT {

    red("Stop"), yellow("Ready"), green("Yallah:)");


    private final String message;

    TRAFFICLIGHT(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
