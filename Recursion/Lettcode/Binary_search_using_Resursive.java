/**
 * Binary_search_using_Resursive
 */
public class Binary_search_using_Resursive {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 5;
        System.out.println(binarySearch(arr, target, 0, arr.length));
    }
    
    static int binarySearch(int arr[], int target, int s, int e) {
        if (s >= e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (arr[m] > target) {
            return binarySearch(arr, target, s, m - 1);
        }

        return binarySearch(arr,target, m + 1, e);
    }
}