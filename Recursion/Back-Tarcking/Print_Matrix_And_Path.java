import java.util.Arrays;

/**
 * Print_Matrix_And_Path
 */
public class Print_Matrix_And_Path {

    public static void main(String[] args) {
        boolean[][] arr = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };

        int[][] path = new int[arr.length][arr[0].length];

        pathMatrix("", arr, 0, 0, path, 1);
    }
    
    static void pathMatrix(String p, boolean[][] meza ,int r, int c, int[][] path, int step) {
        if (r == meza.length - 1 && c == meza[0].length - 1) {
            for (int i = 0; i < path.length; i++) {
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println(p);
            System.out.println();

            // for (int[] is : path) {
            //     System.out.println(Arrays.toString(is));
            // }

            return;
        }

        if (meza[r][c] == false) {
            return;
        }

        meza[r][c] = false;
        path[r][c] = step;

        if (r < meza.length - 1) {
            pathMatrix(p + "D", meza, r +1, c, path, step+1);
        }
        
        if (c < meza[0].length - 1) {
            pathMatrix(p + "R", meza, r, c + 1, path, step+1);
        }
        
        if (r > 0) {
            pathMatrix(p + "U", meza, r - 1, c, path, step+1);
        }
        
        if (c > 0) {
            pathMatrix(p+"L", meza, r, c-1, path, step+1);
        }

        path[r][c] = 0;
        meza[r][c] = true;
    }
}