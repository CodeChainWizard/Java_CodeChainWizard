package Array;

/**
 * Find_the_target_Value
 */
public class Find_the_target_Value {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int target = 4;
        System.out.println(searchTarget(arr, target, 0));
    }

    //----- Here, ruetun Bool Value
    // static boolean searchTarget(int[] arr, int target, int index) {
    //     if (index == arr.length) {
    //         return false;
    //     }

    //     return arr[index] == target || searchTarget(arr, target, index + 1);
    // }

    //----- Here, ruetun int Value
    static int searchTarget(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        return searchTarget(arr, target, index + 1);
    }
}