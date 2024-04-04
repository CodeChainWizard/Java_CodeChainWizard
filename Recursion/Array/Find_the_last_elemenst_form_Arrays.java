package Array;


/**
 * Find_Array_target_return_Array
 */
public class Find_the_last_elemenst_form_Arrays {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 4 };
        int target = 4;
        System.out.println(seachTarget(arr, target, arr.length-1));
    }

    static int seachTarget(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return seachTarget(arr, target, index - 1);
    }
}