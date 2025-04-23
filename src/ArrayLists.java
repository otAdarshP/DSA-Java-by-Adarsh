import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main (String [] args){
        Scanner in =  new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<> (10);

        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);
        list.add (10);

        list.set(9, 89);
        System.out.println (list.get (8));

        for (int i = 0; i < 5; i++){
            System.out.println (in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            System.out.println (list.get(i));
        }

        System.out.println (list);
    }
}
