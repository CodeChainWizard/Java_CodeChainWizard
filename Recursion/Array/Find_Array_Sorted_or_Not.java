package Array;

/**
 * Find_Array_Sorted_or_Not
 */
public class Find_Array_Sorted_or_Not {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(checkSorted(arr, 0));
    }
    
    static boolean checkSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && checkSorted(arr, index + 1);
    }
}