/**
 * Print_1_to_N_without_Loop
 */
public class Print_1_to_N_without_Loop {

    public static void main(String[] args) {
        print_number(5);
    }
    
    static void print_number(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        print_number(n - 1);
    }
}