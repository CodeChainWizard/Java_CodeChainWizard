/**
 * GFGF_Sum_of_natural_numbers_using_recursion
 */
public class GFGF_Sum_of_natural_numbers_using_recursion {

    public static void main(String[] args) {
        System.out.println(sumNumber(3));
    }

    static int sumNumber(int n) {
        if (n == 0) {
            return n;
        }

        return n + sumNumber(n - 1);
    }
}