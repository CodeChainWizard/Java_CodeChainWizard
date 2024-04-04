package Array;

import java.util.ArrayList;

/**
 * FInd_target_and_return_Arrays
 */
public class FInd_target_and_return_Arrays {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4 };
        int target = 3;
        seachTarget(arr, target, 0);
        System.out.println(list);
    }
    
    static  ArrayList<Integer> list = new ArrayList<>();
    static void seachTarget(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        seachTarget(arr, target, index+1);
    }
}