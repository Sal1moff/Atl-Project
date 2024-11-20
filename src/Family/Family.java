package Family;

public class Family {
    private String mother;
    private String father;
    private String children;
    private String pet;

    public Family() {
    }

    public Family(String mother, String father, String children, String pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getMother() {
        return mother;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getFather() {
        return father;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }
}
