package com.Kunal.Arrays;

import java.util.Arrays;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] num2 = new int[nums.length];
        int count =0;
        for (int i : nums){
            num2[count]= nums[i];
            count++;
        }
        System.out.println(Arrays.toString(num2));
    }
}
