/**
 * Find_the_ith_bit_Number
 */
public class Find_the_ith_bit_Number {

    public static void main(String[] args) {
        int arr = 37, k =3;
        System.out.println(iTH_bit_Number(arr, k));
    }

    static int iTH_bit_Number(int arr, int k){
        int solution = arr & ( 1 << (k - 1));
        return solution;
    }
}