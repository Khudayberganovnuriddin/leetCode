package leetcode.top_interview_questions.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(mySet.contains(nums[i])){
                return true;
            }
            mySet.add(nums[i]);
        }
        return false;
    }
}
