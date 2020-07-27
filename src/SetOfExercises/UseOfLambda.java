package SetOfExercises;

public class UseOfLambda {

    public static void doSth(String name) {
        System.out.println("The mighty " + name);
    }

    public static void main(String[] args) {
        //so I just need to use:
        //@FunctionalInterface and below declare Interface (FunctionalInterfaceRR)
        // with only one abstract method (printMyName)
        //after that in the class I can create variable of the interface type
        // then i assign to this variable new variable (myFunnyParmeter)
        // which by defualt will has the same type as the argument of the interface method
        // then after "->" i place the method body
        //NOW I CAN USE THE OBJECT OF INTERFACE TYPE WHICH HAS ONLY ONE JUST DEFINIED METHOD

        FunctionalInterfaceRR fi = myFunnyParmeter -> System.out.println(myFunnyParmeter);

        FunctionalInterfaceRR fi2 = System.out::println;
        FunctionalInterfaceRR fi3 = UseOfLambda::doSth;

        fi.printMyName("Raki is the best!");
        fi2.printMyName("You have no idea how great is Raki...");
        fi3.printMyName("Raki");
    }
}
