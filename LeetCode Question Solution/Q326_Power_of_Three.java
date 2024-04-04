/**
 * Q326_Power_of_Three
 */
public class Q326_Power_of_Three {

    public static void main(String[] args) {
        System.out.println(powerOf3(8));
    }

    static boolean powerOf3(int n) {
        if (n == 1) {
            return true;
        }

        if (n % 3 != 0 || n == 0) {
            return false;
        }

        return powerOf3(n / 3);
    }
}