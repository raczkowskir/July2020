package SetOfExercises;

import org.jetbrains.annotations.NotNull;

public class SimpleExercises1 {

    public static void main(String[] args) {
        SimpleExercises1 simple1 = new SimpleExercises1();

        System.err.println(simple1.getAnInt());

        System.out.println(getRaki());

        ShowResults(2, 3);

        System.out.println(isEven(2));
        System.out.println(isDividedBy3And5(300000L));

        System.out.println(heighten(5, 1));
        System.out.println(returnSquare(9));
        System.out.println(returnSquare(13));

        System.out.println(isItRightAngleThere(3, 4, 5));
        System.out.println(isItRightAngleThere(2, 4, 13));

    }

    private static boolean isItRightAngleThere(int side1, int side2, int side3) {
        return (side1 * side1) + (side2 * side2) == (side3 * side3);
    }

    private static double returnSquare(double number) {
        return Math.sqrt(number);

    }

    private static int heighten(int number, int power) {
        int result = number;

        for (int i = 0; i < (power - 1); i++) {
            result = result * number;
        }
        return result;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static boolean isDividedBy3And5(long number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    private static void ShowResults(int number1, int number2) {
        System.out.println(
                "sum:" + (number1 + number2) +
                        ", ratio:" + (number1 * number2) +
                        ", difference:" + (number1 - number2));
    }


    @NotNull
    private static String getRaki() {
        return "Raki";
    }

    private int getAnInt() {
        return 33;
    }
}


