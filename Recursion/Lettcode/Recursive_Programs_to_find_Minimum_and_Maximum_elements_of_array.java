/**
 * Recursive_Programs_to_find_Minimum_and_Maximum_elements_of_array
 */
public class Recursive_Programs_to_find_Minimum_and_Maximum_elements_of_array {

    public static void main(String[] args) {
        int[] arr = { -1, 2, 3, 4, 5, 6};
        System.out.println("Min:- " + find_min(arr, arr.length));
        System.out.println("MAx:- " + find_max(arr, arr.length));
    }   

    static int find_min(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.min(arr[n - 1], find_min(arr, n - 1));
    }
    
    static int find_max(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.max(arr[n-1], find_max(arr, n-1));
    }
}