/**
 * GFG_Recursive_program_for_prime_number
 * Link:- https://www.geeksforgeeks.org/recursive-program-prime-number/
 */
public class GFG_Recursive_program_for_prime_number {

    public static void main(String[] args) {
        System.out.println(isPrime(15, 2));
    }

    static boolean isPrime(int num, int i) {
        if (num <= 2) {
            return (num == 0) ? true : false;
        }
        if (num % i == 0) {
            return false;
        }

        if (i * i > num) {
            return true;
        }

        return isPrime(num, i + 1);
    }
}