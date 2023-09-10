package explore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khudayberganov Nuriddin
 * @since : 09/09/23 / 10:18 AM
 */
public class Solution144 {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    preorderTreeNode(root, res);
    return res;
  }

  private void preorderTreeNode(TreeNode root, List<Integer> res) {
    if (root != null) {
      res.add(root.val);
      preorderTreeNode(root.left, res);
      preorderTreeNode(root.right, res);
    }
  }
}
