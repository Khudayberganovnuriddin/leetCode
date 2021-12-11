package leetCode.Arrays101.HeightChecker;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for(int i = 0;i<heights.length;i++){
            if(expected[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
