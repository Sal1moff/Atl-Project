package Family;

public class Human {
    private String name;
    private String surname;
    private int age;
    private int weight;
    private String mother;
    private Pet pet;
    private String father;

    public Human() {
    }

    public Human(String name, String surname, int age, int weight, String mother, String father, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.pet = pet;
        this.mother = mother;
        this.father = father;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }


}