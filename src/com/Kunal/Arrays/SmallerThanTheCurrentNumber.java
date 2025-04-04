package com.Kunal.Arrays;

import java.util.Arrays;

public class SmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        int[] out = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if(i!=j && nums[j]<nums[i]){
                    count++;
                }
            }
            out[i]=count;
        }
        System.out.println(Arrays.toString(out));

    }
}
