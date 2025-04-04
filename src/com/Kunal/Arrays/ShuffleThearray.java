package com.Kunal.Arrays;

import java.util.Arrays;

public class ShuffleThearray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int n=2;
        int[] out = new int[nums.length];
        int count=0;
        for (int i = 0; i < n; i++) {
            out[count++] = nums[i];
            out[count++]=nums[i+n];
        }
        System.out.println(Arrays.toString(out));
    }
}
