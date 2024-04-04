/**
 * Pasing_Number
 */
public class Pasing_Number {

    public static void main(String[] args) {
        passed(5);
    }
    
    static void passed(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        passed(--n);

        // --- stackoverflow error
        // passed(n--);

        // ----- Both different 
        // n-- & --n
    }
}