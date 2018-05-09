package com.company.leetcode.sort;

//Problem statement 179 :Given a list of non negative integers,
// arrange them such that they form the largest number.



import java.util.Arrays;
import java.util.Comparator;

public class largestNumber {
    private class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String order1=o1+o2;
            String order2=o2+o1;

            return order2.compareToIgnoreCase(order1);
        }
    }
    public String largestNumber(int[] nums){
        //Get input integer as strings
        String[] asStrs=new String[nums.length];

        for(int i=0;i<nums.length;i++){
            asStrs[i]=String.valueOf(nums[i]);
        }

        //Sort strings according to custom comparator
        Arrays.sort(asStrs,new LargerNumberComparator());

        //If after being sorted ,the largest number is 0 then return 0

        if (asStrs[0].equals("0")){
            return "0";
        }

        //Build the largest number from sorted array
        String largestNumber=new String();
        for(String numAsStr:asStrs){
            largestNumber+=numAsStr;
        }

        return largestNumber;

    }
}
