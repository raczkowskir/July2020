package SetOfExercises;

public class ArrayFactory {
    int size = 5;

    public ArrayFactory(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        ArrayFactory af = new ArrayFactory(4);

        int[] myNewArray = af.oneDimention();
        int[][] myNewArray2 = af.twoDimentions();


        af.displayNumberFromBackWords(1234);
        af.displayStringFromBackWords("No problems.");

    }

    private void displayNumberFromBackWords(int number) {
        String numberInString = String.valueOf(number);
        int numberInStringLength = numberInString.length();

        for (int i = 0; i < numberInStringLength; i++) {
            System.out.println(numberInString.substring(( numberInStringLength - (i + 1)), numberInStringLength - i));

        }
    }

    private void displayStringFromBackWords(String word) {
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++) {
            System.out.println(word.substring(( wordLength - (i + 1)), wordLength - i));

        }
    }

    private int[] oneDimention() {
        return new int[size];
    }

    private int[][] twoDimentions() {
        return new int[size][size];
    }

}
