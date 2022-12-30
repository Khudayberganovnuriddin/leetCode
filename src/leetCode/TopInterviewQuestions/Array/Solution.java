package leetCode.TopInterviewQuestions.Array;

public class Solution {
    public static void main(String[] args) {
        char[][] arr = new char[][]{
                {'.', '3', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '8', '.', '1', '.'},
                {'5', '.', '.', '.', '.', '.', '7', '3', '4'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '1', '.', '6', '.', '7', '.', '.', '.'},
                {'4', '.', '.', '.', '.', '.', '5', '.', '8'},
                {'.', '.', '6', '8', '9', '.', '.', '.', '.'},
                {'3', '.', '.', '.', '2', '.', '.', '.', '.'},
                {'.', '7', '1', '.', '.', '5', '9', '.', '6'}};

        IsValidSudoku validSudoku = new IsValidSudoku();
        System.out.println(validSudoku.isValidSudoku(arr));
    }
}
