package com.Kunal.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies = 3;
        int maxCandies=candies[0];
        for (int i = 1 ; i <candies.length; i++) {
            if(candies[i]>maxCandies){
                maxCandies=candies[i];
            }
        }
//        Listboolean[] out = new boolean[candies.length];
        List<Boolean> out = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if((extraCandies+candies[i])>=maxCandies){
                out.add(i,true);
            }else {
                out.add(i,false);
            }
        }
    }
}
