package leetcode.top_interview_questions.design;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleArray {

    private final int[] nums;

    public ShuffleArray(int[] nums) {
        this.nums = nums;
    }

    public int[] reset() {
        return this.nums;
    }

    public int[] shuffle() {
        int[] shuffleArr;
        shuffleArr = Arrays.copyOf(nums,nums.length);
        Random random = ThreadLocalRandom.current();
        for (int i = nums.length - 1; i > 0; i--) {
            int ind = random.nextInt(i + 1);
            int temp = shuffleArr[ind];
            shuffleArr[ind] = shuffleArr[i];
            shuffleArr[i] = temp;
        }
        return shuffleArr;
    }
}
