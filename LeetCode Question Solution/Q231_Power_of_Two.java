/**
 * Q231_Power_of_Two
 */
public class Q231_Power_of_Two {

    public static void main(String[] args) {
        System.out.println(powerOf2(3));
    }

    static boolean powerOf2(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0 || n == 0) {
            return false;
        }

        return powerOf2(n / 2);
    }
}