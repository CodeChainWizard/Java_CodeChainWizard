/**
 * N_Queens_Question_BackTaracking
 * --> BackTracking means, jayre answer fit nai thi tyare recurvie ma upper na data change kari pachu try kare tane kevai.
 * 
 * SOLVED THIS USING AKKRA BAZZI FORMULA:-
 * T(N) = N * T(N - 1) + O(N^1)
 * 
 * Space Complexity:- O(N * N)
 * Time Complexity :- O(N^3 + N!) => O(N!). (That is not very good Complexity.)
 * 
 */
public class N_Queens_Question_BackTaracking {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] borad = new boolean[n][n];
        // queen(borad, 0);

        System.out.println(queen(borad, 0));
    }

    static int queen(boolean[][] board, int r) {
        if (r == board.length) {
            diaplay(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // placing the queen and chekc row and column
        for (int i = 0; i < board.length; i++) {
            // place the queen if it is safe 
            if (isSafe(board, r, i)) {
                board[r][i] = true;
                count += queen(board, r + 1);
                board[r][i] = false;
            }
        }

        return count;
    }
    
    private static boolean isSafe(boolean[][] board, int r, int c) {
        // check vertical row
        for (int j = 0; j < r; j++) {
            if (board[j][c]) {
                return false;
            }
        }
        
        // Diagnol left
        int maxLeft = Math.min(r, c);
        for (int j = 1; j <= maxLeft; j++) {
            if (board[r - 1][c - 1]) {
                return false;
            }
        }

        // Diagnol Right
        int maxRight = Math.min(r, board.length - c - 1);
        for (int j = 1; j <= maxRight; j++) {
            if (board[r - 1][c + 1]) {
                return false;
            }
        }
        return true;
    }

    static void diaplay(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean ele : row) {
                if (ele) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
        }
        System.out.println();
    }
}