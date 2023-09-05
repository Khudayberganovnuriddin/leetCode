package test;

import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
  public static List<String> generateParenthesis(int n) {

    ArrayList<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    generate(n, 0, 0, result, sb);
    return result;
  }

  public static void generate(int n, int left, int right, List<String> result,
                              StringBuilder sb) {

    if (left < right) {
      return;
    }
    if (left == n && right == n) {
      result.add(sb.toString());
      //sb.delete(0,sb.length());
      return;
    }
    if (left == n) {
      generate(n, left, right + 1, result, sb.append(')'));
      //delete current ')'.
      sb.delete(sb.length() - 1, sb.length());
      return;
    }

    generate(n, left + 1, right, result, sb.append('('));
    //delete current '(' after you finish using it for next recursion.
    sb.delete(sb.length() - 1, sb.length());
    generate(n, left, right + 1, result, sb.append(')'));
    //same as above here.
    sb.delete(sb.length() - 1, sb.length());
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(generateParenthesis(3));


  }

}