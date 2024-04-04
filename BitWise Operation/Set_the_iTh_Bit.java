/**
 * Set_the_iTh_Bit
 * Space and time is:- O(1)
 */
public class Set_the_iTh_Bit {

    // Set  means trun into 1. ==> value is 0 then they convert it's 1 and value 1 then they  don't change anything.
    public static void main(String[] args) {
        // Question:- 1010110
        int n = 10, k = 2;
        System.out.println(setBit(n, k));
    }

    static int setBit(int n, int k){
        return ((1 << k) | n);
    }
}