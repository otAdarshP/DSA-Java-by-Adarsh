package numbers.dsa;

public class PrimeNo {
    public static void main (String[] args){
        int N = 50;
// Sieve of Eratostheses
        for (int n = 2; n <= N; n++){
            boolean isPrime = true;
            for (int i = 2; i*i <= n; i++){
                if (n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(n);
            }
        }

    }
}
