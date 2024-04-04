/**
 * GFG_Find_Frist_Uppercase_value
 * Link:-
 * https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/ß
 */
public class GFG_Find_Frist_Uppercase_value {

    public static void main(String[] args) {
        String str = "codechianwizard";
        System.out.println(findFirstUpperCaseUtil(str));
    }

    static char findFirstUpperCaseUtil(String ch) {
        for (int i = 0; i < ch.length(); i++) {
            if (Character.isUpperCase(ch.charAt(i))) {
                return ch.charAt(i);
            }
        }
        return 0;
    }
}