/**
 * GFG_Program_for_length_of_a_string_using_recursion
 * Link:-
 * https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
 */
public class GFG_Program_for_length_of_a_string_using_recursion {

    public static void main(String[] args) {
        String s = "CodeChainWizard";
        System.out.println(countStringNumber(s));
    }

    static int countStringNumber(String s) {
        if (s.length() == 0) {
            return 0;
        } else {
            return countStringNumber(s.substring(1)) + 1;
        }
    }
}