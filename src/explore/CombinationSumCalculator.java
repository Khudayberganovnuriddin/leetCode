package explore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution 39
 * A utility class to calculate all unique combinations from a set of numbers that add up to a
 * target.
 */
public class CombinationSumCalculator {

  /**
   * This method calculates all unique combinations from a set of candidates that add up to target.
   * It uses a technique called backtracking to explore all possibilities.
   *
   * @param candidates - array of candidate numbers.
   * @param target     - the targeted sum.
   * @return a list of lists of integers representing unique combinations.
   */
  public List<List<Integer>> calculateCombinations(int[] candidates, int target) {
    List<List<Integer>> combinations = new ArrayList<>();
    Arrays.sort(candidates);
    calculateCombinations(combinations, new ArrayList<>(), candidates, target, 0);
    return combinations;
  }

  /**
   * This is a helper method used by the calculateCombinations(). It using the concept of
   * backtracking to calculate the combinations.
   *
   * @param combinations       - resulting combinations.
   * @param currentCombination - currently forming combination.
   * @param candidates         - array of candidate numbers.
   * @param target             - the remaining sum needed to meet the target.
   * @param startIdx           - index of the candidate array, from where to start the combination.
   */
  private void calculateCombinations(
      List<List<Integer>> combinations,
      List<Integer> currentCombination,
      int[] candidates,
      int target,
      int startIdx
  ) {
    if (target < 0) {
    } else if (target == 0) {
      combinations.add(currentCombination);
    } else {
      for (int i = startIdx; i < candidates.length; i++) {
        List<Integer> newCombination = new ArrayList<>(currentCombination);
        newCombination.add(candidates[i]);
        calculateCombinations(
            combinations, newCombination,
            candidates, target - candidates[i], i
        );
      }
    }
  }
}
