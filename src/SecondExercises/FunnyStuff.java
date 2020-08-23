package SecondExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FunnyStuff {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("New funnyStuff object creation.");
        FunnyStuff funnyStuff = new FunnyStuff();

        System.out.println("Creation new file, and filled in it.");
        funnyStuff.writeToFile("MyFunnyFile.txt");

        System.out.println("Reading file content in a loop.");
        funnyStuff.readFromFile("MyFunnyFile.txt");

        System.out.println("Good bye!");
    }

    private void writeToFile(String fileName) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(fileName);
        printWriter.println("I am gonna to read this!");
        printWriter.println("Second funny line");
        printWriter.println("The end.");

        printWriter.close();
    }

    private void readFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        for (int i = 0; i < 3; i++) {
            String sentenceFromFile = scanner.nextLine();
            System.out.println(sentenceFromFile);
        }
    }
}
