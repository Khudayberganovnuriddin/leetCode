package leetCode.TopInterviewQuestions.Others;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        // ------------- Hash Set --------------------
//        Set<Integer> numSet = new HashSet<>();
//        for(Integer num : nums){
//            numSet.add(num);
//        }
//
//        int expectedNumber = nums.length + 1;
//        for(int i =0;i<expectedNumber;i++){
//            if(!numSet.contains(i)){
//                return i;
//            }
//        }
//        return -1;

        // --------------- Bit Manipulation -------------------------
//        int missing = nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            missing ^= i ^ nums[i];
//        }
//        return missing;

        // ---------------- Gauss Formula --------------------------
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
