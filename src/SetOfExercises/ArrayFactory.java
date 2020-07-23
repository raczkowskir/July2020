package SetOfExercises;

public class ArrayFactory {
    int size = 0;

    public ArrayFactory(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        ArrayFactory af = new ArrayFactory(30);

        int[] myNewArray = af.oneDimention();
        int[][] myNewArray2 = af.twoDimentions();


/*        af.displayNumberFromBackWords(1234);
        af.displayStringFromBackWords("No problems.");
        af.numberToBinary(5000);
        System.out.println(af.isPalindrome("nokon"));*/
        af.returnMatrix();

    }

    private void displayNumberFromBackWords(int number) {
        String numberInString = String.valueOf(number);
        int numberInStringLength = numberInString.length();

        for (int i = 0; i < numberInStringLength; i++) {
            System.out.println(numberInString.substring((numberInStringLength - (i + 1)), numberInStringLength - i));

        }
    }

    private void displayStringFromBackWords(String word) {
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++) {
            System.out.println(word.substring((wordLength - (i + 1)), wordLength - i));

        }
    }

    private boolean isPalindrome(String word) {
        StringBuffer buffy = new StringBuffer(word);
        buffy = buffy.reverse();
        String result = String.valueOf(buffy);
        System.out.println(result);
        return word.equals(result);
    }

    private String numberToBinary(int number) {
        String result = Integer.toBinaryString(number);
        System.out.println(result);
        return result;
    }

    private int[] oneDimention() {
        return new int[size];
    }

    private int[][] twoDimentions() {
        return new int[size][size];
    }

    private int[][] returnMatrix() {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j]);
            }
        }
        return matrix;
    }


}

//tab[3][3]
//1000
//0100
//0010
//0001

//tab[0][0]=1
//tab[1][1]=1
//tab[2][2]=1
