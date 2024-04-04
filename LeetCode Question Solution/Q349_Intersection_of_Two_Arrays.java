import java.util.Arrays;
import java.util.HashSet;

/**
 * Q349_Intersection_of_Two_Arrays
 */
public class Q349_Intersection_of_Two_Arrays {

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(inrersaction(arr1, arr2)));
    }

    static int[] inrersaction(int[] arr1, int[] arr2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : arr1) {
            set1.add(i);
        }

        for (int i : arr2) {
            if(set1.contains(i)){
                set2.add(i);
            }
        }

        int[] new_arr = new int[set2.size()];
        int index = 0;
        for (int i : set2) {
            new_arr[index++] = i;
        }
        return new_arr;
    }
}   