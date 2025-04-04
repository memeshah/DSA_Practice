package com.Kunal.Arrays;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] out = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = 0; j <= i; j++) {
                sum+=nums[j];
            }
            out[i]=sum;
        }
        System.out.println(Arrays.toString(out));
    }
}
