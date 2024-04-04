/**
 * Find_the_Magic_Number
 */
public class Find_the_Magic_Number {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(logicOfMagicNumber(n));
    }

    static int logicOfMagicNumber(int n){
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int lastDigit = n & 1;
            n = n >> 1;
            ans += lastDigit * base;
            base = base * 5;
        }

        return ans;
    }
}