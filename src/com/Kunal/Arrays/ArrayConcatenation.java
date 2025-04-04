package com.Kunal.Arrays;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {


        int[] nums = {1,3,2,1};
        int[] out = new int[2 * nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            out[i]= nums[i];
            out[i+nums.length]= nums[i];
        }
        System.out.println(Arrays.toString(out));
    }
    }

