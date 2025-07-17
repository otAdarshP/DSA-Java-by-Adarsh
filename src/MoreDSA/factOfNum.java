package MoreDSA;

public class factOfNum {
    public static void main (String[] args){
        int fact = 9;
        System.out.println (fact);

    }

    public static int fact (int factorial){
        
//        arm 
        if (factorial == 1){
            return factorial;
        }
        
        System.out.println (factorial);
        return factorial * ((fact (factorial - 1)));
    }
}
