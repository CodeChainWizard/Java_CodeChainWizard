/**
 * CountNumber_of_Zero
 */
public class CountNumber_of_Zero {

    public static void main(String[] args) {
        System.out.println(countZero(10071));
    }
    
    static int countZero(int n) {
        return helper(n, 0);
    }

    //---- special pattern, how to passed a value to above calls.
    private static int helper(int n, int i) {
        if (n == 0) {
            return i;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, i + 1);
        }

        return helper(n / 10, i);
    }
}