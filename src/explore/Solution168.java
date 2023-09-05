package explore;

public class Solution168 {
  public static String convertToTitle(int columnNumber) {
    if (columnNumber <= 0)
      throw new IllegalArgumentException("Input is not valid!");

    StringBuilder sb = new StringBuilder();
    while (columnNumber > 0) {
      columnNumber--;
      char ch = (char) (columnNumber % 26 + 'A');
      columnNumber /= 26;
      sb.append(ch);
    }

    sb.reverse();
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(convertToTitle(5));

  }
}
