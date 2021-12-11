package turing;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] components = sc.nextLine().split(" ");

        int[] nums = new int[components.length];
        for(int i=0;i<components.length;i++){
            nums[i] = Integer.parseInt(components[i]);
        }

        int k = Integer.parseInt(sc.nextLine());
        int[] result = ArraySolution.rotate(nums,k);
        System.out.println(Arrays.toString(result));
    }
}
