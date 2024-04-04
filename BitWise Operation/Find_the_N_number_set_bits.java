/**
 * Find_the_N_number_set_bits
 */
public class Find_the_N_number_set_bits {

    public static void main(String[] args) {
        int n = 9;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    static int setBits(int n){
        int counter = 0;

        //----- One way
        // while (n > 0) {
        //     counter++;
        //     n -= (n & (-n));
        // }

        //----- Second way
        while (n>0) {
            counter++;
            n = n & (n-1);
        }
        return counter;
    }
}