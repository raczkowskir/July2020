package SetOfExercises;

public class ArrayFactory {
    int size = 5;

    public ArrayFactory(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        ArrayFactory af = new ArrayFactory(4);

        int[] myNewArray = af.oneDimention();
        int [][] myNewArray2 = af.twoDimentions();
    }

    private int[] oneDimention() {
        return new int[size];
    }

    private int[][] twoDimentions() {
        return new int[size][size];
    }

}
