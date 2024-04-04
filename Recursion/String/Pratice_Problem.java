import java.util.ArrayList;
import java.util.List;

/**
 * Pratice_Problem
 */
public class Pratice_Problem {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(setData(arr));
    }
    
    static List<List<Integer>> setData(int[] arr) {
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for (int num : arr) {
            int n = outerList.size();
            for (int i = 0; i < n; i++) {
                List<Integer> innerList = new ArrayList<>(outerList.get(i));
                innerList.add(num);
                outerList.add(innerList);
            }
        }

        return outerList;
    }
}