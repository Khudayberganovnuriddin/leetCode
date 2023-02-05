package explore;

public class Solution6 {
  public static void main(String[] args) {
    // PAYPALISHIRING - PAY -P- ALI -S- HIR -I- NG
    // PAHNAPLSIIGYIR
    System.out.println(convert("PAYPALISHIRING", 3));
  }

  public static String convert(String s, int numRows) {
    if (numRows == 1) return s;

    StringBuilder answer = new StringBuilder();
    int n = s.length();
    int charsInSection = 2 * (numRows - 1);

    for (int currRow = 0; currRow < numRows; ++currRow) {
      int ind = currRow;

      while (ind < n) {
        answer.append(s.charAt(ind));
        if (currRow != 0 && currRow != numRows - 1) {
          int charsInBetween = charsInSection - 2 * currRow;
          int secondIndex = ind + charsInBetween;

          if (secondIndex < n) {
            answer.append(s.charAt(secondIndex));
          }
        }
        ind += charsInSection;
      }
    }

    return answer.toString();
  }
}
