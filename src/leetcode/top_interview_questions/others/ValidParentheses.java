package leetcode.top_interview_questions.others;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {
    HashMap<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put('[', ']');
    map.put('{', '}');

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);
      if (map.containsKey(curr)) {
        stack.push(curr);
      } else if (map.containsValue(curr)) {
        if (!stack.empty() && map.get(stack.peek()) == curr) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return stack.empty();
  }
}
