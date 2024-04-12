package explore;

public class Solution168 {

  public static String convertNumberToColumnName(int columnNumber) {
    if (columnNumber <= 0) {
      throw new IllegalArgumentException("Input is not valid!");
    }

    StringBuilder columnName = new StringBuilder();
    while (columnNumber > 0) {
      columnNumber--;
      char columnChar = getColumnChar(columnNumber);
      columnNumber /= 26;
      columnName.append(columnChar);
    }

    return columnName.reverse().toString();
  }

  private static char getColumnChar(int columnNumber) {
    return (char) (columnNumber % 26 + 'A');
  }

  public static void main(String[] args) {
    System.out.println(convertNumberToColumnName(5));
  }
}
