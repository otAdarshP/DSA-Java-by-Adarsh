package JavaCore;
import java.util.Scanner;

public class One {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter a valid number: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("The number " + num + " is even.");
        }
        else{
            System.out.println("The number " + num + " is odd.");
        }
    }
}
