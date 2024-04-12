package explore;

import java.util.ArrayList;
import java.util.List;


/**
 * Solution 94
 */
public class TreeTraverser {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inorderTraversalHelper(root, result);
    return result;
  }

  private void inorderTraversalHelper(TreeNode node, List<Integer> result) {
    if (node != null) {
      inorderTraversalHelper(node.left, result);
      result.add(node.val);
      inorderTraversalHelper(node.right, result);
    }
  }
}
