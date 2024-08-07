package leetcode.top_interview_questions.others;

public class NumberOf1Bits {

  public int hammingWeight(int n) {
    int count = 0;
    for (int i = 1; i < 33; i++) {
      if (getBit(n, i)) {
        count++;
      }
    }
    return count;
  }

  public boolean getBit(int n, int i) {
    return (n & (1 << i)) != 0;
  }
}
