/**
 * Remove_one_char
 */
public class Remove_one_char {

    public static void main(String[] args) {
        String body = "aaabb";
        skip("", body);

        System.out.println(skipString(body));

        String body2_for_applre = "fordataappleeatdaily";
        System.out.println(skipApple(body2_for_applre));
    }
    

    // First way...
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
    

    // Second Way...
    static String skipString(String body) {
        if (body.isEmpty()) {
            return "";
        }

        char ch = body.charAt(0);

        if (ch == 'a') {
            return skipString(body.substring(1));
        } else {
            return ch + skipString(body.substring(1));
        }
    }

    // Remove Word...
    static String skipApple(String body) {
        if (body.isEmpty()) {
            return "";
        }

        if (body.startsWith("apple")) {
            return skipApple(body.substring(5));
        } else {
            return body.charAt(0) + skipApple(body.substring(1));
        }
    }
}