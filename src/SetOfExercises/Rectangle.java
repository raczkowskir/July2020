package SetOfExercises;

public class Rectangle {
    private double length = 10.0;
    private double width = 10.5;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateAll() {
        calculateSurfaceArea();
    }

    private double calculateSurfaceArea() {
        return length * width;
    }

}
