package CollectionsFramework;
import java.util.*;

// .add
// .pop
// .peek
public class LearnStack {
    public static void main (String[] args){

        Stack <String> animal = new Stack<>();

        // add ".push()"
        animal.push ("Lion");

        // delete ".pop()"
        animal.pop(); // removes the topmost value in the stack

        // view ".peek()"
        animal.peek(); // shows the topmost value, and doesn't delete it

    }
}
