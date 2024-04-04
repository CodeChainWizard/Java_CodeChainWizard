import java.util.ArrayList;

/**
 * Subsequence
 */
public class Subsequence {

    public static void main(String[] args) {
        String body = "abc";
        sub("", body);
        System.out.println(SubsequenceReturn("", body));

        System.out.println(SubsequenceAscii("", body));
    }
    
    static void sub(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " , ");
            return;

        }

        char ch = up.charAt(0);

        sub(p + ch, up.substring(1));
        sub(p, up.substring(1));
    }
    
    static ArrayList<String> SubsequenceReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = SubsequenceReturn(p + ch, up.substring(1));
        ArrayList<String> right = SubsequenceReturn(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> SubsequenceAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> f = SubsequenceAscii(p+ch, up.substring(1));
        ArrayList<String> s = SubsequenceAscii(p, up.substring(1));
        ArrayList<String> t = SubsequenceAscii(p + (ch+0), up.substring(1));

        f.addAll(s);
        f.addAll(t);

        return f;
    }
}
