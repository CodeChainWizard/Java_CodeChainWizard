/**
 * Hacker_Recursive_Method_for_Calculating_Factorial
 */
public class Hacker_Recursive_Method_for_Calculating_Factorial {

    public static void main(String[] args) {
        System.out.println(factoNumber(5));
    }

    static int factoNumber(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factoNumber(n - 1);
        }
    }
}