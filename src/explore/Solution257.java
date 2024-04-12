package explore;

import explore.helper.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution257 {

  public static List<String> binaryTreePaths(TreeNode root) {
    ArrayList<String> result = new ArrayList<>();
    if (root != null) {
      exploreNodes(root, "", result);
    }
    return result;
  }

  private static void exploreNodes(TreeNode node, String path, List<String> accumulativePaths) {
    String appendedPath = path + node.val;

    if (node.left == null && node.right == null) {
      accumulativePaths.add(appendedPath);
    } else {
      String extendedPath = appendedPath + "->";
      if (node.left != null) {
        exploreNodes(node.left, extendedPath, accumulativePaths);
      }
      if (node.right != null) {
        exploreNodes(node.right, extendedPath, accumulativePaths);
      }
    }
  }
}
