package explore.references;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Khudayberganov Nuriddin
 * @apiNote Solution 225
 * @since : 09/09/23 / 10:59 AM
 */
public class MyStack {
  private final Queue<Integer> queue;

  public MyStack() {
    queue = new LinkedList<>();
  }

  public void push(int x) {
    queue.add(x);
    for (int i = 1; i < queue.size(); i++) {
      queue.add(queue.remove());
    }
  }

  public int pop() {
    return queue.remove();
  }

  public int top() {
    return queue.peek();
  }

  public boolean empty() {
    return queue.isEmpty();
  }
}
