/**
 * Q79_Word_Search
 * https://leetcode.com/problems/word-search/description/?envType=daily-question&envId=2024-04-03
 */
public class Q79_Word_Search {

    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
            {'A','D','E','E'}
        };
        String word = "ABCCEFD";

        System.out.println(searchWord(board, word, 0 ,0, ""));
    }
    
    static boolean searchWord(char[][] board, String word, int r, int c, String p) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    static boolean search(char[][] board, String word, int i, int j, int s) {
        if (i < 0 || i == board.length || j < 0 || j == board[0].length) {
            return false;
        }

        if (board[i][j] != word.charAt(s) || board[i][j] == '*') {
            return false;
        }

        if (s == word.length() - 1) {
            return true;
        }

        char cache = board[i][j];
        board[i][j] = '*';

        boolean isExist = search(board, word, i + 1, j, s + 1) || search(board, word, i - 1, j, s + 1)
                || search(board, word, i, j + 1, s + 1) || search(board, word, i, j - 1, s + 1);

        board[i][j] = cache;
        return isExist;
    }

}