package leetcode.daily_challenges.medium_challenges;

import explore.helper.TreeNode;

/**
 * @author Khudayberganov Nuriddin
 * @since : 18/07/24 / 15:18
 */
public class Solution1530 {

  private static int ans = 0;

  public static void main(String[] args) {
    TreeNode n1 = new TreeNode(1);
    n1.left = new TreeNode(2);
    n1.left.right = new TreeNode(3);
    n1.right = new TreeNode(4);

    countPairs(n1, 3);
    System.out.println(ans);
  }

  public static int countPairs(TreeNode root, int distance) {
    dfs(root, distance);
    return ans;
  }

  private static int[] dfs(TreeNode node, int distance) {
    int[] counts = new int[distance + 1];
    if (node == null) {
      return counts;
    } else if (node.left == null && node.right == null) {
      counts[1] = 1;
      return counts;
    } else {
      int[] left = dfs(node.left, distance);
      int[] right = dfs(node.right, distance);

      for (int l = 1; l <= distance; l++) {
        for (int r = 1; r + l <= distance; r++) {
          ans += left[l] * right[r];
        }
      }

      for (int i = 2; i <= distance; i++) {
        counts[i] = left[i - 1] + right[i - 1];
      }
      return counts;
    }
  }
}
