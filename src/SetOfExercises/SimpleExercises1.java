package SetOfExercises;

import org.jetbrains.annotations.NotNull;

public class SimpleExercises1 {

    public static void main(String[] args) {
        SimpleExercises1 simple1 = new SimpleExercises1();

        System.err.println(simple1.getAnInt());

        System.out.println(getRaki());

        ShowResults();
    }

    private static void ShowResults() {
        System.out.println("sum:" + (x + y) + ", ratio:" + (x * y) + ", difference:" + (x - y));
    }


    @NotNull
    private static String getRaki() {
        return "Raki";
    }

    private int getAnInt() {
        return 33;
    }
}


