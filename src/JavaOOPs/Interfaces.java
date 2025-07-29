package JavaOOPs;

public class Interfaces {
    public static void main (String [] args){
        EngineeringCollege college1 = new EngineeringCollege();
        college1.info();
    }
}

interface College {
     public void info();
}

class EngineeringCollege implements College{
    public void info(){
        System.out.println ("Not the best in the world");
    }
}
