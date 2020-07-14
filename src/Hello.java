import org.jetbrains.annotations.NotNull;

public class Hello {

    private static GenericTypes<?> myGt;
    public Integer unicId = 99;



    public static void main(String @NotNull [] args) {
        GenericTypes gt = new GenericTypes<>(5);

        //TODO add more fun

        // FIXME now

        System.out.println(args[2] + "Raki");

        System.out.println(gt.getMyVariable());
        gt.setMyVariable("Interesting idea");
        System.out.println("I spent 1h for watching YT stream with some tips for intelliJ and angaing with keymap.");

        System.out.println("$DATE$ Raki TIME$");

        gt.setMyVariable((2 + 3 - 7 + 4 * 2));
        printGt(gt);

        // System.exit(9);

//        System.out.print("whotever");
//        System.lineSeparator();
//        System.out.print("whatever");

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
