package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//public static int[] removeElement(int[] nums, int val)(int[] nums беребиз/
// int val берилген сан nums[] ичинде болсо удалить. анан массивти бирге артка жылдырабыз)
public class Main {

    public static void main(String[] args) {

//        Integer[] a = {2,45,2,6,8,0,7,34,27};


        List<Integer> nums = new ArrayList<Integer>(List.of(2, 7, 4, 11, 15, 5));
        int target = 9;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    System.out.println("index is:  " + j + "  ,  " + i);
                } else {
                    System.out.println(0);

                }
            }
        }
    }
    
//    public static int [] removeElement(int [] nums,int val){
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==val){
//
//            }
//        }
//    }
}
//        System.out.println(a+ " , "+ b);


