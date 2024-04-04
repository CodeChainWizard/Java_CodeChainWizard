
/**
 * Find_the_Dulicated_Elemensts_in_Arrays
 */
import java.util.*;
public class Find_the_Dulicated_Elemensts_in_Arrays {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        ArrayList<Integer> ans = searchIntegers(arr, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> searchIntegers(int[] arr, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == arr[index + 1]) {
            list.add(index);
        }

        return searchIntegers(arr, index + 1, list);
    }
}