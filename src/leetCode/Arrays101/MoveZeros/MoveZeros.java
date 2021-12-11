package leetCode.Arrays101.MoveZeros;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int n = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[n];
                nums[n] = nums[i];
                nums[i] = temp;
                n++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
