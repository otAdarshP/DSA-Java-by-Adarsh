package OOPS;

class ObjectCreationRequisite{
    public int sId;
    public int dId;
    public String name;

    // the non-created constructor is the DEFAULT CONSTRUCTOR

    ObjectCreationRequisite(){
        System.out.println("This is a non-parameterized constructor");
    }

    ObjectCreationRequisite(int sId, int dId){
        System.out.println("below is a parameterized constructor");
        System.out.print("What is your sId? --> My sId is as follows:  " + sId);
        System.out.println("What is your dId? --> My dId is as follows: " + dId);
    }
    // THE ABOVE 2 ARE ALSO CONSTRUCTOR OVER-LOADING: Same class, different parameters.

    public void College(){
        System.out.println("This is the non-parameterized method");
    }
    public void College (int num, int phone){
        System.out.println("This is a parameterized parameter + method over loading");
    }
    // above are 2 egs of method over loading.


    public void CollegeDetails (int sId, int dId, String name){
        System.out.println("The student id:" + sId);
        System.out.println("The dept id:" + dId);
        System.out.println("The name is: " + name);
    }
}
