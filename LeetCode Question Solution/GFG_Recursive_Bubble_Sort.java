import java.util.Arrays;

/**
 * GFG_Recursive_Bubble_Sort
 */
public class GFG_Recursive_Bubble_Sort {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 6 };
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n - 1);
    }
}