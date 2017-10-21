package com.jetbrains;

public class Solution {
    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end) {
            mid = (start+end)/2;
            if(arr[mid]==target) {
                System.out.println(target);
                return mid;
            }
            else if(arr[mid]<target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
