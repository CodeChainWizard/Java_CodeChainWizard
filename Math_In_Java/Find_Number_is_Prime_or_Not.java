/**
 * Find_Number_is_Prime_or_Not
 */
public class Find_Number_is_Prime_or_Not {

    public static void main(String[] args) {
        // time Complexity is: O(n * √n);
        int n = 23;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        // int c = 2;

        // while (c * c <= n) {
        //     if(n % c == 0){
        //         return false;
        //     }
        //     c++;
        // }

        for (int i = 2; i*i <= n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}