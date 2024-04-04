/**
 * Number_of_Steps_to_Reduce_a_Number_to_Zero
 */
public class Number_of_Steps_to_Reduce_a_Number_to_Zero {

    public static void main(String[] args) {
        System.out.println(count(123));
    }
    
    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int i) {
        if (n == 0) {
            return i;
        }

        if (n % 2 == 0) {
            return helper(n / 2, i + 1);
        }
        return helper(n - 1, i + 1);
    }
}