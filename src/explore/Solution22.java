package explore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khudayberganov Nuriddin
 * @since : 09/09/23 / 9:38 AM
 */
public class Solution22 {
  public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<>();
    backtrack(res, "", 0, 0, n);
    return res;
  }

  private void backtrack(List<String> res, String body, int front, int rear, int max) {
    if (body.length() == max * 2) {
      res.add(body);
      return;
    }

    if (front < max) {
      backtrack(res, body.concat("("), front+1, rear, max);
    }
    if (rear < front) {
      backtrack(res, body.concat(")"), front, rear+1, max);
    }
  }
}
