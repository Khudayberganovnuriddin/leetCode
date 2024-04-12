package explore;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreeTraversal {

  private static final int INITIAL_LIST_CAPACITY = 10;

  public List<Integer> performPreorderTraversal(TreeNode root) {
    List<Integer> nodesInPreorder = new ArrayList<>(INITIAL_LIST_CAPACITY);
    addNodesInPreorder(root, nodesInPreorder);
    return nodesInPreorder;
  }

  private void addNodesInPreorder(TreeNode node, List<Integer> nodesInPreorder) {
    if (node != null) {
      nodesInPreorder.add(node.val);
      addNodesInPreorder(node.left, nodesInPreorder);
      addNodesInPreorder(node.right, nodesInPreorder);
    }
  }
}
