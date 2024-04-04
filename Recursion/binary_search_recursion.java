/**
 * binary_search_recursion
 */
public class binary_search_recursion {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 45, 10 };
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    
    static int search(int[] arr, int taegte, int s ,int e){
        if (s >= e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (arr[m] == taegte) {
            return m;
        }

        if (arr[m] > taegte) {
            return search(arr, taegte, s, m-1);
        }

        return search(arr, taegte, m + 1, e);
    }
}