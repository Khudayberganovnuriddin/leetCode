package leetCode.Arrays101.CheckItsDoubleExist;

import java.util.HashSet;
import java.util.Set;

public class CheckItsDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> mySet = new HashSet<>();
        for(int i : arr){
            if(mySet.contains(i*2) || (i%2 == 0 && mySet.contains(i/2)))
                return true;
            mySet.add(i);
        }
        return false;
    }
}
