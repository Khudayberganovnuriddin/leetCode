package explore;

import explore.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution257 {
  public static List<String> binaryTreePaths(TreeNode root) {
    ArrayList<String> result = new ArrayList<>();
    if (root != null) checkNodes(root, "", result);
    return result;
  }

  private static void checkNodes(TreeNode root, String body, List<String> res) {
    if (root.left == null && root.right == null) res.add(body + root.val);
    if (root.left != null) checkNodes(root.left, body + root.val + "->", res);
    if (root.right != null) checkNodes(root.right, body + root.val + "->", res);
  }
}
