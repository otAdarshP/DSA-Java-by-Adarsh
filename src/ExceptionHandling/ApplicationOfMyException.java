package ExceptionHandling;

public class ApplicationOfMyException {
    public static void main (String [] args){
        int one = -5;
        int two = 10;
        int result = one + two;
        try {
            if (result > 0){
                throw new MyException("Value should be more than zero");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
