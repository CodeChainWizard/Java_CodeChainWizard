/**
 * SudokuSolver_Backtarcking
 * 
 * -------------------------------
 * Space Complexity:- O(N^2)
 * Time Complexity:- O(9*N^2)
 * --------------------------------
 * 
 */
public class SudokuSolver_Backtarcking {

    public static void main(String[] args) {
        int[][] board = new int[][] {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (solve(board)) {
            display(board);

        } else {
            System.out.println("Cannot Solve");
        }
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;

                    emptyLeft = false;
                    break;
                }
            }

            // ---- if you found some empty ele in row than break.
            if (emptyLeft == false) {
                break;
            }
        }
        if (emptyLeft == true) {
            return true;
            // ---- means Sudoku solve.
        }

        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int r, int c, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[r][c] == num) {
                return false;
            }
        }
        for (int[] nums : board) {
            if (nums[c] == num) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = r - r % sqrt;
        int colStart = c - c % sqrt;

        for (int i = rowStart; i < sqrt + rowStart; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}