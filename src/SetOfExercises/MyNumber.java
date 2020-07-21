package SetOfExercises;

import java.util.Arrays;

public class MyNumber {
    int number;

    public static void main(String[] args) {
        MyNumber newNumber = new MyNumber(7);

        System.out.println(Arrays.toString(newNumber.returnReversedIntegerArray(new int[]{1, 2, 3, 4})));
        newNumber.returnSpecificArray(9);
        newNumber.returnSpecificArrayByWhileLoop(8);
    }

    MyNumber(int number) {
        this.number = number;
    }

    private boolean isOdd() {
        return (this.number % 2 != 0);
    }

    private boolean isEven() {
        return (this.number % 2 == 0);
    }

    private double sqrt() {
        return Math.sqrt(this.number);
    }

    private MyNumber add(MyNumber x) {
        return new MyNumber(this.number + x.number);
    }

    private MyNumber subtract(MyNumber x) {
        return new MyNumber(this.number - x.number);
    }

    private double pow(MyNumber x) {
        return Math.pow(this.number, x.number);
    }

    private String[] returnStringArray() {
        return new String[]{"a", "b", "c", "d", "e"};
    }

    private void returnSpecificArray(int lastNumber) {
        for (int i = 0; i <= lastNumber; i++) {
            System.out.print(i + " ");
        }
    }

    private void returnSpecificArrayByWhileLoop(int lastNumber) {
        int i = 0;
        while (i <= lastNumber) {
            i++;
            System.out.print(i + " ");
        }
    }

    private Integer[] returnReversedIntegerArray(int[] myArray) {
        int i = myArray.length;
        Integer[] myReversetArr = new Integer[i];
        for (Integer integer : myArray) {
            myReversetArr[i - 1] = integer;
            i--;
        }

        return myReversetArr;
    }

}
