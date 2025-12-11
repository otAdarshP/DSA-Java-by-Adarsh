package CompleteExceptionHandling;

import org.w3c.dom.ls.LSOutput;

// THIS IS FOR TRY/CATCH/FINALLY/THROW/THROWS IN THE EXCEPTION HANDLING
public class TryCatch {
    public static void main (String[] args) throws Exception{
        int[] arr = {1, 2, 3};

        try{
            int index = arr[5];
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("You have exceeded the size of the array, please try again.");
        }
        finally{
            System.out.println("We are glad to see you here!");
        }

        try{
            int ans = arr[2] / 2;
            if (ans == 0){
                System.out.println("Its an even number");
            }
        }
        catch (Exception e){
            throw new Exception("the output is odd");
        }
    }
}
