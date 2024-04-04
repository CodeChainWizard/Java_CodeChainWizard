import java.util.Arrays;

public class Marge_Sort_In_Place {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        inPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    static void inPlace(int[] arr, int s, int e) {
        if(e - s == 1) {
            return;
        }
        int mid = (s + e)/2;

        inPlace(arr, s, mid);
        inPlace(arr, mid, e);

        margetInPlage(arr, s, mid, e);
    }

    static void margetInPlage(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[s + k2] = mix[k2];
        }
    }
}
