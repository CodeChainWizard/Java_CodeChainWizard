/**
 * Print_N_to_1
 */
public class Print_N_to_1 {

    public static void main(String[] args) {
        print_N_to_1(10);
        System.out.println("----------------");
        print_1_to_N(1);
    }

    static void print_N_to_1(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(n);
        print_N_to_1(n - 1);
    }
    
    static void print_1_to_N(int n) {
        if (n == 10) {
            System.out.println(10);
            return;
        }

        System.out.println(n);
        print_1_to_N(n + 1);
    }
}