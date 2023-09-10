package explore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khudayberganov Nuriddin
 * @since : 09/09/23 / 10:12 AM
 */
public class Solution94 {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    inorderTreeNode(root, res);
    return res;
  }

  public void inorderTreeNode(TreeNode node, List<Integer> res) {
    if (node != null) {
      inorderTreeNode(node.left, res);
      res.add(node.val);
      inorderTreeNode(node.right, res);
    }
  }
}
