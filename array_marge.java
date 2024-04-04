import java.util.Arrays;

/**
 * array_marge
 */
public class array_marge {

    public static void main(String[] args) {
        int[] arr = {10,3,2,90,88};
        int[] arr2 = {6,1,4};   
        System.out.println(Arrays.toString(marge_array(arr, arr2)));
    }

    static int[] marge_array(int[] arr, int[] arr2){
        int[] new_arr = new int[arr.length + arr2.length];

        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];    
        }

        for(int i = 0; i<arr2.length; i++){
            new_arr[arr.length + i] = arr2[i];
        }

        Arrays.sort(new_arr);
        return new_arr;
    }

}