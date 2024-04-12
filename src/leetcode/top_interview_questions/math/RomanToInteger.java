package leetcode.top_interview_questions.math;

import java.util.HashMap;

public class RomanToInteger {

  public int romanToInt(String s) {
    int resp = 0, pre = 0;
    HashMap<Character, Integer> romanNums = new HashMap<>();
    romanNums.put('I', 1);
    romanNums.put('V', 5);
    romanNums.put('X', 10);
    romanNums.put('L', 50);
    romanNums.put('C', 100);
    romanNums.put('D', 500);
    romanNums.put('M', 1000);

    for (Character val : s.toCharArray()) {
      int value = romanNums.get(val);
      if (value > pre) {
        resp -= pre;
        resp += value - pre;
      } else {
        resp += value;
      }
      pre = value;
    }
    return resp;
  }
}
