package com.DSASheet;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] out = new int[2];
        //Method 1
        /*for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    out[0]=i;
                    out[1]=j;
                    System.out.println(Arrays.toString(out));
                }
            }

        }*/
        //Method 2
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                System.out.println(new int[]{i,map.get(nums[i])});
                return;
            }
            map.put(target-nums[i],i);
        }
    }
}
