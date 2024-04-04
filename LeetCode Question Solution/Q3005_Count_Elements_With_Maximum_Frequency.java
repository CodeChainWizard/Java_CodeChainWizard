import java.util.HashMap;

/**
 * Q3005_Count_Elements_With_Maximum_Frequency
 */
public class Q3005_Count_Elements_With_Maximum_Frequency {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,5};
        System.out.println(maxFrequencyElements(arr));
    }

    static int maxFrequencyElements(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        for (int i : map.values()) {
            if(i == maxFreq){
                count += maxFreq;
            }
        }

        return count;
    }
}