package basics;
import java.util.*;

public class AofR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();

        System.out.println("The area of rectangle is: " + Math.PI * height * breadth);
    }
}
