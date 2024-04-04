/**
 * Q342_Power_of_Four
 */
public class Q342_Power_of_Four {

    public static void main(String[] args) {
        System.out.println(poerOf4(15));
    }

    static boolean poerOf4(int n) {
        if (n == 1) {
            return true;
        }

        if (n % 4 != 0 || n == 0) {
            return false;
        }

        return poerOf4(n / 4);
    }
}