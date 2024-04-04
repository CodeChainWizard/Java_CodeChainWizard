package Array;

import java.util.ArrayList;

/**
 * Find_the_target_and_return_ArrayList
 */

public class Find_the_target_and_return_ArrayList {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2,2, 3, 4 };
        int target = 2;
        
        // ArrayList<Integer> ans = searchIntegers(arr, target, 0, new ArrayList<>());
        // System.out.println(ans);

        ArrayList<Integer> ans = searchIntegers1(arr, target, 0);
        System.out.println(ans);
    }
    
    static ArrayList<Integer> searchIntegers(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return searchIntegers(arr, target, index + 1, list);
    }

    static ArrayList<Integer> searchIntegers1(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        // this will conatins answer for that function call only.
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> anserOfCalled = searchIntegers1(arr, target, index + 1);
        list.addAll(anserOfCalled);

        return list;
    }
}