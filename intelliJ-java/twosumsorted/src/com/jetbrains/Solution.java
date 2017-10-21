package com.jetbrains;

class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int lo = 0;

        int hi = numbers.length-1;

        int[] res = new int[2];
        while(lo<=hi) {
            if(numbers[lo]+numbers[hi]==target) {
                res[0] = lo+1;
                res[1] = hi+1;
                break;
            }
            else if(numbers[lo]+numbers[hi]<target) {
                lo+=1;
            }
            else if(numbers[lo]+numbers[hi]>target){
                hi-=1;
            }

        }
        return res;

    }
}