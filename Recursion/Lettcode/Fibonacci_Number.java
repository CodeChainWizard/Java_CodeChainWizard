/**
 * Fibonacci_Number
 */
public class Fibonacci_Number {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {

            System.out.print(numbers(i) + " ");
        }
        
        // System.out.println(numbers2(10));
    }
    
    static int numbers(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int numbers2(int n) {
        if (n < 2) {
            return n;
        }

        return numbers2(n-1) + numbers2(n - 2);
    }
}