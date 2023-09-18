package explore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Khudayberganov Nuriddin
 * @since : 18/09/23 / 11:41 AM
 */
public class Solution39 {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    backtrack(res, new ArrayList<>(), candidates, target, 0);
    return res;
  }

  private void backtrack(List<List<Integer>> res, ArrayList<Integer> temp, int[] candidates, int target, int idx) {
    if (target < 0) return;
    else if (target == 0) res.add(new ArrayList<>(temp));
    else {
      for (int i = idx; i < candidates.length; i++) {
        temp.add(candidates[i]);
        backtrack(res, temp, candidates, target - candidates[i], i);
        temp.remove(temp.size() - 1);
      }
    }
  }
}
