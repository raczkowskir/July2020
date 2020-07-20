package SetOfExercises;

public class Rectangle {
    private double length = 10.0;
    private double width = 10.5;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double calculateSurfaceArea() {
        return length * width;
    }

    private double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    private double calculateDiagonal() {
        return Math.sqrt(length * length + width * width);
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3.0, 5.0);

        System.out.println(rec.calculateDiagonal());
        System.out.println(rec.calculatePerimeter());
        System.out.println(rec.calculateSurfaceArea());

    }
}

