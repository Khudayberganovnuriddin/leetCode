package leetCode.Arrays101.MaxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                c = 0;
            }else{
                c++;
                result = Math.max(result, c);
            }
        }
        return result;
    }
}
