package FunctionalProgrammingInJava;



@FunctionalInterface
interface BookAction{
    void perform();
}

@FunctionalInterface
interface Operation {
    int add (int a, int b); // find sum of a and b.
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        // 1.
        // WITHOUT LAMBDA EXPRESSION
        BookAction action1 = new BookAction(){
            @Override
            public void perform(){
                System.out.println("Action performed");
            }
        };
        action1.perform();

        // 2.
        // SEMI-IMPLEMENTED LAMBDA EXPRESSION
        BookAction action2 = () -> {
            System.out.println("Action performed");
        };
        action2.perform();

        //  3.
        // FULLY-IMPLEMENTED LAMBDA EXPRESSION
        BookAction action3 = () -> System.out.println("Action performed");
        action3.perform();

        // second functional interface case

        // WITHOUT LAMBDA
        Operation ops1 = new Operation (){
            @Override
            public int add (int a, int b){
                return 0;
            }
        };
        System.out.println(ops1.add(5, 8));

        //WITH LAMBDA
        Operation ops = (int a , int b) -> { return a + b;  };
        System.out.println(ops.add(5, 8));
    }
}
