package explore;

import java.util.ArrayList;
import java.util.List;

public class Solution401 {
  public List<String> readBinaryWatch(int turnedOn) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i <= 11; i++) {
      for (int j = 0; j <= 59; j++) {
        if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
          result.add(String.format("%d:%02d", i ,j));
        }
      }
    }
    return result;
  }
}
