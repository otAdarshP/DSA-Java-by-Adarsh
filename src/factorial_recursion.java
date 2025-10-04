public class factorial_recursion {
    public static void main (String[] args){
        int res = factorial(5);
        System.out.println(res);
    }
    static int factorial (int n){
        int result = 1;
        if (n == 1){
            return result;
        }
        return n * factorial(n-1);
    }
}
