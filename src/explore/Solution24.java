package explore;

import explore.references.TreeNode;

public class Solution24 {

  public static TreeNode swapPairs(TreeNode node) {
    if (node == null || node.next == null) {
      return node;
    }
    TreeNode nextNode = node.next;
    node.next = swapPairs(node.next.next);
    nextNode.next = node;
    return nextNode;
  }
}
