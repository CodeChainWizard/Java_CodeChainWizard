import java.util.*;

/**
 * Q2540_Minimum_Common_Value
 */
public class Q2540_Minimum_Common_Value {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,4};
        System.out.println(getCommon(arr1, arr2));
    }

    static int getCommon(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, map.getOrDefault(i, 0)) + 1);
        }

        for (int i : arr2) {
            if(map.containsKey(i) && map.get(i) > 0){
                return i;
            }
        }

        return -1;
    }
}