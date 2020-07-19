package SetOfExercises;

public class Human {

    private enum Sex {
        MALE,
        FEMALE
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
    return this.sex == Sex.MALE;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    private String name = "Raki";
    private Sex sex = Sex.MALE;
    private int age = 30;
    private int weight = 75;
    private int height = 183;
}
