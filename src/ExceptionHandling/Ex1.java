package ExceptionHandling;

public class Ex1 {
    public static void main (String [] args){
        int a = 10;
        int b = 0;

        int div = a / b;
        System.out.println(div);
    }
}

// this returns error:

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at ExceptionHandling.Ex1.main(Ex1.java:8)
