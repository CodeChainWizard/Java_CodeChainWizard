/**
 * Revece_the_number
 */
public class Revece_the_number {

    static int sum = 0;

    static void Reverce(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        Reverce(n/10);
    }

    public static void main(String[] args) {
        Reverce(1234);
        System.out.println(sum);
    }
    
}