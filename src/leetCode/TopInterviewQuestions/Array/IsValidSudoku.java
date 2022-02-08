package leetCode.TopInterviewQuestions.Array;

import java.util.HashSet;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> temp = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (temp.contains(board[i][j])) {
                    return false;
                }
                temp.add(board[i][j]);
            }
        }
        return true;
    }
}
