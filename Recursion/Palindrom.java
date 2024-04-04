/**
 * Palindrom
 */
public class Palindrom {

    static int sum = 0;

    static void reverce(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        reverce(n / 10);
    }

    
    static boolean PalindromNumber(int n) {
        return n == sum;
    }

    public static void main(String[] args) {
        reverce(1221);
        System.out.println(PalindromNumber(1221));
        System.out.println(sum);
    }
    

}