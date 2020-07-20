package SetOfExercises;

public class MyNumber {
    int number;

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

    private Integer[] returnReversedIntegerArray(Integer[] myArray) {
        int i = myArray.length;
        Integer[] myReversetArr = new Integer[i];
        for (Integer integer : myArray) {
            myReversetArr[i] = integer;
            i--;
        }

        return myReversetArr;
    }

}
