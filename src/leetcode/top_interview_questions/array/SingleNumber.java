package leetcode.top_interview_questions.array;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int i : nums){
            if(mySet.contains(i)){
                mySet.remove(i);
            }else{
                mySet.add(i);
            }
        }
        return mySet.iterator().next();
    }
}
