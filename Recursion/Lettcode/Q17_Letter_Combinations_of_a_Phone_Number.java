import java.util.ArrayList;

/**
 * Q17_Letter_Combinations_of_a_Phone_Number
 */
public class Q17_Letter_Combinations_of_a_Phone_Number {

    public static void main(String[] args) {
        // letterCombinations("", "12");
        System.out.println(leeArrayList("", "12"));
    }

    static void letterCombinations(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + ", ");
            return;
        }

        int digit = up.charAt(0) - '0'; // This will convert '2' into 2.

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            letterCombinations(p + ch, up.substring(1));
        }
    }
    
    static ArrayList<String> leeArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> newList = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            newList.addAll(leeArrayList(p + ch, up.substring(1)));
        }

        return newList;
    }
}