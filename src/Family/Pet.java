package Family;

public class Pet {
    private String species;
    private String nickName;
    private int age;
    private int trickLevel;

    public Pet() {

    }

    public Pet(String species, String nickName, int age, int trickLevel) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public int getTrickLevel() {
        return trickLevel;
    }
}
