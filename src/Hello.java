import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class Hello {

    public static void main(String[] args) {
        /*System.out.println("My first impression :) ");
        Hello hello = new Hello();
        System.out.println(hello.returnOnePlusValue(2));*/

        GenericTypes gt = new GenericTypes<>(5);

        System.out.println(gt.getMyVariable());
        gt.setMyVariable("Ciekawa sprawa"); //
        System.out.println(gt.getMyVariable());
    }

    public int returnOnePlusValue(int value) {
        return returnOnePlusValue(value, 2);
    }

    public int returnOnePlusValue(int value, int value2) {
        return 1 + value + value2;
    }


    // alt ctrl v

    public void newCoolMethod() {
        int cokolwiek = returnOnePlusValue(3);
    }

}
