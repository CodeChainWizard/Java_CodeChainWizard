import java.util.Arrays;

/**
 * Bubble_Sort_using_rescursive_way
 */
public class Bubble_Sort_using_rescursive_way {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sorting_array(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sorting_array(int[] arr, int n) {
        if (n == 1) {
            return;

        }

        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }

            if (count == 0) {
                return;
            }
        }
        
        sorting_array(arr, n - 1);
    }
}