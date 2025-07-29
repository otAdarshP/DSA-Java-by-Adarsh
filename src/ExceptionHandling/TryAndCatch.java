package ExceptionHandling;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class TryAndCatch {
    public static void main (String[] args){
        int a = 20;
        int b = 0;
        try{
            divide(a, b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("At least you tried");
        }
    }

    private static void divide(int a, int b) throws Exception {
        if (b == 0){
            throw new Exception("don't divide by 0");
        }
    }
}
