public class factorial_loop {
    public static void main (String[] args){
        int res = factorial (5);
        System.out.println(res);

    }

    public static int factorial(int n){
        int result = 1;
        int size = n;
        for (int i = 1; i < size; i++){
            result *= i;
        }
        return result;
    }
}
