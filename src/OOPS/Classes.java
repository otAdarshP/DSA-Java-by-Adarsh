package OOPS;

public class Classes {
    public static void main(String[] args) {

        // creating object
        ObjectCreationRequisite ob1, ob2;
        ob1 = new ObjectCreationRequisite();
        ob2 = new ObjectCreationRequisite(12, 8);


        ob1.sId = 123;
        ob1.CollegeDetails(123, 8, "MSD");

        ob1.College();

    }
}
