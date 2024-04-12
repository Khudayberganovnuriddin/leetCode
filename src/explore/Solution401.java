package explore;

import java.util.ArrayList;
import java.util.List;

public class Solution401 {

  public List<String> readBinaryWatch(int turnedOn) {
    List<String> result = new ArrayList<>();
    for (int hours = 0; hours <= 11; hours++) {
      for (int minutes = 0; minutes <= 59; minutes++) {
        if (areCountsMatching(hours, minutes, turnedOn)) {
          result.add(String.format("%d:%02d", hours, minutes));
        }
      }
    }
    return result;
  }

  private boolean areCountsMatching(int hours, int minutes, int turnedOn) {
    return Integer.bitCount(hours) + Integer.bitCount(minutes) == turnedOn;
  }
}
