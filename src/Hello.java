import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class Hello {

    private static GenericTypes<?> myGt;
    public Integer unicId = 99;

    public static void main(String[] args) {
        GenericTypes gt = new GenericTypes<>(5);

        System.out.println(gt.getMyVariable());
        gt.setMyVariable("Interesting idea");
        System.out.println("I spent 1h for watching YT stream with some tips for intelliJ and angaing with keymap.");


        gt.setMyVariable((2 + 3 - 7 + 4 * 2));
        printGt(gt);

        printGt();

        Hello hello1 = null;
        Hello hello2 = new Hello();
        hello2.unicId = 4;

        boolean condition = true;

        while (condition) {
            System.out.println("Is hello2 equals hello2? " + hello2.equals(hello2));
            condition = false;
        }
    }

    protected static void printGt() {
        printGt(new GenericTypes<>(9));
    }

    @Override
    public boolean equals(Object obj) {
        Hello hello = (Hello) obj;

        return (super.equals(hello.unicId)) && (super.equals(hello));
     }

    public static void printGt(GenericTypes<?> myGt) {
        Hello.myGt = myGt;
        System.out.println(myGt.getMyVariable());
    }


}
