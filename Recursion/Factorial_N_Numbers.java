/**
 * Factorial_N_Numbers
 */
public class Factorial_N_Numbers {

    public static void main(String[] args) {
        System.out.println(ficato(5));
    }

    static int ficato(int n) {
        if (n <= 1) {
            return 1;
        }
         
        return n * ficato(n - 1);
    }
}