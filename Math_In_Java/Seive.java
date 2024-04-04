/**
 * Seive
 */
public class Seive {

    public static void main(String[] args) {
        // Time Complecity:- O(n * log(log(n)))
        int n = 37;
        boolean[] prime = new boolean[n + 1]; // boolean array default value soted false.
        isPrime(n, prime);
    }

    static void isPrime(int n, boolean[] prime){
        for (int i = 2; i*i <= n; i++) {
            if(!prime[i]){
                for (int j = i*2; j <= n; j+=i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}