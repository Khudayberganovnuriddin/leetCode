package leetcode.daily_challenges.easy_challenges;

public class Solution997 {

  public static void main(String[] args) {
    int[][] trust = {{1, 3},{2,3}};
    int n = 3;
    System.out.println(new Solution997().findJudge(n, trust));
  }

  public int findJudge(int n, int[][] trust) {
    int[] trustScore = new int[n + 1];
    for (int[] relation : trust) {
      trustScore[relation[0]]--;
      trustScore[relation[1]]++;
    }
    for (int i = 1; i <= n; i++) {
      if (trustScore[i] == n - 1) {
        return i;
      }
    }
    return -1;
  }
}
