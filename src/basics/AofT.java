package basics;
import java.util.*;

public class AofT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of triangle below");
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();

        System.out.print("Area of Traingle is: " + (1.0/2) * (base * height)); // we should make 1/2 either a float or double
    }
}
