package explore;

public class Solution6 {

  public static void main(String[] args) {
    // PAYPALISHIRING - PAY -P- ALI -S- HIR -I- NG
    // PAHNAPLSIIGYIR
    System.out.println(convert("PAYPALISHIRING", 3));
  }

  public static String convert(String str, int numRows) {
    if (numRows == 1) {
      return str;
    }

    StringBuilder result = new StringBuilder();
    int strLength = str.length();
    int charsInSection = 2 * (numRows - 1);

    // iterating through rows
    for (int currRow = 0; currRow < numRows; ++currRow) {
      int index = currRow;

      // appending characters for each segment in the row
      while (index < strLength) {
        appendCharacterAtCalculatedIndex(index, currRow, charsInSection, str, strLength, result);
        index += charsInSection;
      }
    }

    return result.toString();
  }

  private static void appendCharacterAtCalculatedIndex(int index, int currRow, int charsInSection,
      String str, int strLength, StringBuilder result) {
    result.append(str.charAt(index));

    // if it's not an edge row, calculate and append the character in between
    if (currRow != 0 && currRow != charsInSection / 2) {
      int charsInBetween = charsInSection - 2 * currRow;
      int secondIndex = index + charsInBetween;

      if (secondIndex < strLength) {
        result.append(str.charAt(secondIndex));
      }
    }
  }
}
