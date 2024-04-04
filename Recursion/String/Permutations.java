import java.util.*;

/**
 * Permutations
 */
public class Permutations {

    public static void main(String[] args) {
        String body = "abcd";
        // permutation_string("", body);
        System.out.println(permutation_strin1ArrayList("", body));
        System.out.println(permutation_string_count("", body));
    }
    
    static void permutation_string(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + ", ");
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation_string(f + ch + s, up.substring(1));
        }
    }
    
    static ArrayList<String> permutation_strin1ArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            newList.addAll(permutation_strin1ArrayList(f + ch + s, up.substring(1)));
        }
        return newList;
    }

    static int permutation_string_count(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
           count =  count + permutation_string_count(f + ch + s, up.substring(1));
        }

        return count;
    }
}