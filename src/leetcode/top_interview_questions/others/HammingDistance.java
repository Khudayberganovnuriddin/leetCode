package leetcode.top_interview_questions.others;

public class HammingDistance {

  public int hammingDistance(int x, int y) {
    return Integer.bitCount(x ^ y);
  }
}
