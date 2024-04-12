package explore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khudayberganov Nuriddin
 * @since : 09/09/23 / 9:38 AM
 * Solution 22
 */
public class BalancedParenthesisGenerator {

  public static final String OPEN_PARENTHESIS = "(";
  public static final String CLOSE_PARENTHESIS = ")";

  public List<String> generateBalancedParenthesis(int pairCount) {
    List<String> result = new ArrayList<>();
    generateParenthesisPair(result, "", 0, 0, pairCount);
    return result;
  }

  private void generateParenthesisPair(List<String> result, String current, int openCount,
      int closeCount, int pairMaxCount) {
    if (current.length() == pairMaxCount * 2) {
      result.add(current);
      return;
    }
    if (openCount < pairMaxCount) {
      generateParenthesisPair(result, current.concat(OPEN_PARENTHESIS), openCount + 1, closeCount,
          pairMaxCount);
    }
    if (closeCount < openCount) {
      generateParenthesisPair(result, current.concat(CLOSE_PARENTHESIS), openCount, closeCount + 1,
          pairMaxCount);
    }
  }
}
