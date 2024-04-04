/**
 * GFG_Digit_Sum
 */
public class GFG_Digit_Sum {

    public static void main(String[] args) {
        System.out.println(sum(19));
    }

    static int sum(int num) {
        if (num == 0) {
            return 0;
        }

        return (num % 10 + sum(num / 10));
    }
}