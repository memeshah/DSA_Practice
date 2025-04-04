package com.Kunal.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        ArrayList<Integer> target = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        int[] result = new int[target.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = target.get(i);
        }
        System.out.println(Arrays.toString(result));
        }
    }

