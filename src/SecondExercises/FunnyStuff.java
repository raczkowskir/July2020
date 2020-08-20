package SecondExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FunnyStuff {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
        System.out.println("Still remember how to use it!");

//        Scanner scan = new Scanner(System.in);
//        String sentence = scan.nextLine();
//        FunnyStuff fS = new FunnyStuff();
//        fS.printNumbers(Integer.valueOf(sentence));

        writeToFile();

    }

    private static void writeToFile() throws FileNotFoundException, InterruptedException {
//        File file = new File("funnyData");
        System.out.println("0RR");
        PrintWriter pW = new PrintWriter("funnyData.txt");
        System.out.println("1RR");
        pW.println("Something interesting");
        System.out.println("2RR");
        Object o = new Object();
        System.out.println("3RR");
//        o.wait((long) 5000.0);
        System.out.println("4RR");
        pW.close();
        System.out.println("5RR");
    }



    public void printNumbers(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println(i);
        }
    }
}
