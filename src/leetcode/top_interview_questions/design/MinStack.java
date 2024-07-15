package leetcode.top_interview_questions.design;

import java.util.ArrayList;

public class MinStack {

  private final ArrayList<Integer> stack;

  public MinStack() {
    stack = new ArrayList<>();
  }

  public void push(int val) {
    stack.add(val);
  }

  public void pop() {
    stack.remove(stack.size() - 1);
  }

  public int top() {
    return stack.get(stack.size() - 1);
  }

  public int getMin() {
    return stack.stream().min(Integer::compareTo).get();
  }
}
