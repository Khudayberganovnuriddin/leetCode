package turing;

class ArraySolution {
    public static int[] rotate(int[] nums, int k) {
        int[] result = null;

        for(int i=0;i<k;i++){
            int j;
            int temp;
            temp = nums[nums.length-1];
            for(j=nums.length-1;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }

        result = nums.clone();

        return result;
    }
}
