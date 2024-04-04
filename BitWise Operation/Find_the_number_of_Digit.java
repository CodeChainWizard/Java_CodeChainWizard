/**
 * Find_the_number_of_Digit
 */
public class Find_the_number_of_Digit {

    public static void main(String[] args) {
        int n = 2;
        int b = 2;
        System.out.println(digitNumber(n, b));
    }
    static int digitNumber(int n, int b){
        int asn = (int)(Math.log(n)/Math.log(b)) + 1;
        return asn;
    }
}