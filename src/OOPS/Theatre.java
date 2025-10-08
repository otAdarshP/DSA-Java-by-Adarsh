package OOPS;

public class Theatre {
    int seats;
    String movie = "MSD";

    public void show(){
        this.movie = "Mahi"; // this represents to the "Theatre" object t1.
        System.out.println("Now showing: " + movie);
    }
}

class Mall{
    public static void main(String[] args) {
        Theatre t1 = new Theatre();
        t1.show();
    }
}
