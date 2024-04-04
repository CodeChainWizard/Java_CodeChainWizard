/**
 * Q509_Fibonacci_Number
 * Link:- https://leetcode.com/problems/fibonacci-number/description/
 */
public class Q509_Fibonacci_Number {
    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++) {
            // System.out.println(numberFibo(i));
            System.out.println(bigNumbeFibo(i));
        }
    }

    // This method will return the nth fibonacci number for small numbers
    static int numberFibo(int n) {
        if (n < 2) {
            return n;
        }

        return numberFibo(n - 1) + numberFibo(n - 2);
    }

    // This method will return the nth fibonacci number for big numbers
    static int bigNumbeFibo(int n) {
        int sqrt5 = (int) Math.sqrt(5);
        return (int) ((int) (Math.pow((1 + sqrt5), n) - Math.pow((1 - sqrt5), n)) / (Math.pow(2, n) * sqrt5));
    }
}