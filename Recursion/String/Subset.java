import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subset
 */
public class Subset {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        System.out.println(subSet(arr));
        // System.out.println(subSetDulicated(arr));
    }
    
    static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for (int num : arr) {
            int n = outerList.size();
            for (int i = 0; i < n; i++) {
                List<Integer> interList = new ArrayList<>(outerList.get(i));
                interList.add(num);
                outerList.add(interList);
            }
        }

        return outerList;
    }

    static List<List<Integer>> subSetDulicated(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());
        int s = 0;
        int e = 0;

        for (int i = 0; i < arr.length; i++) {
            s = 0;
            
            // if curreent and prev elements same than, s = e + 1;
            if (i > 0 && arr[i] == arr[i - 1]) {
                s = e + 1;
            }
            e = outerList.size() - 1;
            int n = outerList.size();
            for (int j = s; j < n; j++) {
                List<Integer> interList = new ArrayList<>(outerList.get(j));
                interList.add(arr[i]);
                outerList.add(interList);
            }
        }

        return outerList;
    }
}