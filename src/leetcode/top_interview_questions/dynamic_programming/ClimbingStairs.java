package leetcode.top_interview_questions.dynamic_programming;

public class ClimbingStairs {

  public int climbStairs(int n) {
      if (n == 1) {
          return 1;
      }
      if (n == 2) {
          return 2;
      }

    int num1 = 1;
    int num2 = 2;
    int resp = 0;

    for (int i = 2; i < n; i++) {
      resp = num1 + num2;
      num1 = num2;
      num2 = resp;
    }

    return resp;
  }
}
