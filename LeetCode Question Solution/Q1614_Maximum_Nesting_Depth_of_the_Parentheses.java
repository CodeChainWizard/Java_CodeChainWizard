/**
 * Q1614_Maximum_Nesting_Depth_of_the_Parentheses
 */
public class Q1614_Maximum_Nesting_Depth_of_the_Parentheses {

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(Number_Parentheses(s));
    }

    static int Number_Parentheses(String s) {
        int count = 0;
        int max = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;

                if (max < count)
                    max = count;

            } else if (ch == ')') {
                count--;
            }
        }

        return max;
    }
}