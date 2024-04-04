import java.util.Arrays;

/**
 * Sorting_Array_Using_Quick_Sort
 */
public class Sorting_Array_Using_Quick_Sort {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 1 };
        sorting(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // low and high represent the what part of array working on.
    static void sorting(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;

        int mid = s + (e - s) / 2;
        int myPiovt = arr[mid];

        while (s <= e) {

            // also reason why if its already sorted it will not sorted.
            while (arr[s] < myPiovt) {
                s++;
            }
            while (arr[e] > myPiovt) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        //now my pivot is at correct index, please sort two halves now.
        sorting(arr, low, e);
        sorting(arr, s, high);
    }
}