import java.util.Arrays;

/**
 * Q832_Flipping_an_Image
 */
public class Q832_Flipping_an_Image {

    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0},
            {1,0,1},
            {0,0,0},
        };

        System.out.println(Arrays.toString(number_XOR(arr)));
    }
    static int[][] number_XOR(int[][] arr){
        for (int[] row : arr) {
            for (int i = 0; i < (arr[0].length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length-i-1] ^ 1;
                row[arr[0].length-i-1] = temp;
            }
        }
        return arr;
    }
}