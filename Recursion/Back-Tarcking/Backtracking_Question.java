/**
 * Backtracking_Question
 */
public class Backtracking_Question {

    public static void main(String[] args) {
        boolean[][] arr = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };

        allPath("", arr, 0, 0);
    }
    
    static void allPath(String p, boolean[][] meza, int r, int c) {
        if (r == meza.length - 1 && c == meza[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (meza[r][c] == false) {
            return;
        }

        // Make a CHANGE
        meza[r][c] = false;

        if (r < meza.length - 1) {
            allPath(p + "D", meza, r + 1, c);
        }
        
        if (c < meza[0].length - 1) {
            allPath(p + "R", meza, r, c + 1);
        }
        
        if (r > 0) {
            allPath(p + "U", meza, r - 1, c);
        }
        
        if (c > 0) {
            allPath(p + "L", meza, r, c - 1);
        }

        // Revert a CHANGE
        meza[r][c] = true;
    }
}