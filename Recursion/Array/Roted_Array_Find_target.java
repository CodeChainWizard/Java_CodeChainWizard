package Array;

/**
 * Roted_Array
 */
public class Roted_Array_Find_target {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };
        int target = 8;
        System.out.println(searchTarget(arr, target, 0, arr.length-1));
    }

    static int searchTarget(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return searchTarget(arr, target, s, mid - 1);
            } else {
                return searchTarget(arr, target, mid + 1, e);
            }
        }

        if (target >= arr[mid] && target <= arr[e]) {
            return searchTarget(arr, target, mid+1, e);
        } else {
            return searchTarget(arr, target, s, mid - 1);
        }
    }
}