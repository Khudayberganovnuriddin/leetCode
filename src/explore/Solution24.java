package explore;

import explore.references.TreeNode;

public class Solution24 {

  public static TreeNode swapPairs(TreeNode head) {
    if (head == null || head.next == null) return head;
    TreeNode t = head.next;
    head.next = swapPairs(head.next.next);
    t.next = head;
    return t;
  }
}
