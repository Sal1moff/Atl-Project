package Seasons;

public enum SEASONS {

    Spring(10, 30, "Spring is mid season between winter and summer this reson is changeable."),
    Summer(10, 50, "Summer is so hot season in year"),
    Autumn(0, 20, "Autumn is cold but not greater winter"),
    Winter(-15, 20, "So cold season in year");
    private final int minTemp;
    private final int maxTemp;
    private final String description;

    SEASONS(int minTemp, int maxTemp, String describtion) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.description = describtion;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public String getDescription() {
        return description;
    }

    public String getInfo() {
        return "season is:" + this.name() + " minimum temperature is:" + getMinTemp() + " maximum temperature is:" + getMaxTemp() + " and describtion is:" + getDescription();
    }
}
