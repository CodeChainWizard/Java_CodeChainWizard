/**
 * Find_single_Elements_In_Array
 */
public class Find_single_Elements_In_Array {

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,5,2,4};
        System.out.println(singleElements(arr));
    }

    static int singleElements(int[] arr){
        int ans = 0;

        for (int i : arr) {
            ans = ans ^ i;
        }

        return ans;
    }
}