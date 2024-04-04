import java.util.Arrays;

/**
 * Sum_triangle_from_array
 */
public class Sum_triangle_from_array {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        triangle(arr);
    }
    
    static void triangle(int[] arr) {
        if (arr.length < 1) {
            return;
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int value_of_two_sum = arr[i] + arr[i + 1];
            newArr[i] = value_of_two_sum;
        }

        triangle(newArr);
        System.out.println(Arrays.toString(arr));
    }
}