package CollectionsFramework;
import java.util.ArrayList;

//      Dynamic allocation of space in storage. Better than Arrays for the same reason.
//      Eg. if the size is N, once the ArrayList is halfway filled, it will change the size to N + N / 2 + 1.

// ArrayList has the following operators for our operations:
// - name.add("value")
// - name.add (index, "value")
// - name.addAll (add another arrayList)
// - name.get (index) => for retrieval
// - name.set (index, value)
// - name.contains ("value")
// - name.remove (index)
// - name.clear () => remove all values from the list

public class LearnArrayList {
    public static void main (String[] args){

        ArrayList<String> childName = new ArrayList<>();

        System.out.println(childName.add("Adarsh"));
        childName.add(1, "Amrita");

        ArrayList<String> parentName = new ArrayList<>();
        System.out.println(childName);
        parentName.add("Sanjay");
        parentName.add (1, "Ruchi");

        childName.addAll(parentName);

        System.out.println(childName);

        childName.get(1);
        System.out.println(childName);

    }
}
