import java.util.Arrays;

/**
 * Q977_Squares_of_a_Sorted_Array
 */
public class Q977_Squares_of_a_Sorted_Array {

    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(squary_array(arr)));
    }

    static int[] squary_array(int[] arr){
       int[] new_arr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i] * arr[i];     
        }

        Arrays.sort(new_arr);

       return new_arr;
    }
}