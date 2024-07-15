package leetcode.top_interview_questions.array;

import java.util.HashSet;

public class IsValidSudoku {

  public boolean isValidSudoku(char[][] board) {
    HashSet<String> temp = new HashSet<>();
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        char val = board[i][j];
        if (val != '.') {
          if (!temp.add("row" + val + " " + i)
              || !temp.add("col" + val + " " + j)
              || !temp.add("row-col" + val + " " + i / 3 + j / 3)) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
