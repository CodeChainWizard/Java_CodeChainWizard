/**
 * Sum_of_n_Numbers
 */
public class Find_the_sum_of_digit_sum {

    public static void main(String[] args) {
        System.out.println(find_sum(1234));
    }
    
    // --- Complextity O(log(n))
    static int find_sum(int n){
        if (n == 0) {
            return 0;
        }

        return (n%10) + find_sum(n/10);
    }
}