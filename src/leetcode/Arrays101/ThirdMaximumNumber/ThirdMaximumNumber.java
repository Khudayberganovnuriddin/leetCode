package leetcode.Arrays101.ThirdMaximumNumber;

import java.util.TreeSet;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num: nums){
            if(set.size() < 3) {
                set.add(num);
            }else if(set.first() < num && !set.contains(num)){
                set.pollFirst();
                set.add(num);
            }
        }
        return set.size() == 3 ? set.first() : set.last();
    }
}
