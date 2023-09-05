package leetcode.Arrays101.GreatestNumberOnRight;

public class GreatestNumberOnRight {
    public static int[] replaceElements(int[] arr) {
        int n = -1;
        for(int i=arr.length-1;i>=0;i--){
            int temp = arr[i];
            arr[i] = n;
            n = Math.max(temp, n);
        }
        return arr;
    }
}
