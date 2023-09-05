package leetcode.top_interview_questions.dynamic_programming;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int r1 = 0;
        int r2 = 0;
        for(int num : nums){
            int temp = r1;
            r1 = Math.max(r2+num,r1);
            r2 = temp;
        }
        return r1;
    }
}
