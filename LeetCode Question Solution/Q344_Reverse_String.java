import java.util.Arrays;

/**
 * Q344_Reverse_String
 */
public class Q344_Reverse_String {

    public static void main(String[] args) {
        char[] ch = { 'o', 'n', 'e' };
        reverseData(ch, 0, ch.length - 1);
        System.out.println(Arrays.toString(ch));
    }

    static void reverseData(char[] ch, int s, int e) {
        if (s <= e) {
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;

            reverseData(ch, s + 1, e - 1);
        }
    }
}