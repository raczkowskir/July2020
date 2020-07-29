package SetOfExercises;

/*Napisz program, który pobierze od użytkownika cztery łańcuchy znaków, które umieścisz w liście. Następnie posortuj tę listę używając metody List.sort. Użyj wyrażenia lambda, które posortuje łańcuchy znaków malejąco po długości.*/

import java.util.*;

public class LambdaEx {

    Scanner myScanner;
    ArrayList myList;
    List<String> myFakeList = new ArrayList<>();

    public LambdaEx() {
        this.myScanner = new Scanner(System.in);
        this.myList = new  ArrayList();
        this.setMyFakeList();
    }

    public static void main(String[] args) {
        LambdaEx lex = new LambdaEx();
        lex.printMyList();
        lex.fillInMyList();

        System.out.println(lex.myList);
        lex.myList.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(lex.myList);
    }

    public void setMyFakeList() {
        String[] newArray = {"tiger", "alligator", "crocodile", "snake", "monkey"};
        myFakeList.add(0, "frog");
        myFakeList.addAll(Arrays.asList(newArray));
    }

    public void fillInMyList() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Type new string:");
            myList.add(myScanner.nextLine());
        }
    }

    public void printMyList() {
        for (Object s : myList) {
            System.out.println(s);
        }
    }
}
