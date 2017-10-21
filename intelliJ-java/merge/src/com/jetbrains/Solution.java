package com.jetbrains;



class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) {
            for(int i=0; i<n; i++) {
                nums1[i] = nums2[i];
            }
        }
        if(n==0) {
            return;
        }
        int[] nums1_copy = nums1.clone();

        int nums1_counter = 0;
        int nums2_counter = 0;
        while(nums1_counter<m && nums2_counter<n) {
            if(nums1_copy[nums1_counter]<nums2[nums2_counter]) {
                nums1[nums1_counter+nums2_counter] = nums1_copy[nums1_counter];
                nums1_counter+=1;
            }
            else {
                nums1[nums1_counter+nums2_counter] = nums2[nums2_counter];
                nums2_counter+=1;
            }
        }
        if(nums1_counter!=m) {
            while(nums1_counter<m) {
                nums1[nums1_counter+nums2_counter] = nums1_copy[nums1_counter];
                nums1_counter+=1;
            }
        }
        else {
            while(nums2_counter<n) {
                nums1[nums1_counter+nums2_counter] = nums2[nums2_counter];
                nums2_counter+=1;
            }
        }
    }

    public void swap() {
        ListNode res = new ListNode(0);
        ListNode next = new ListNode(1);
        res.next = next;
        res = next;
        System.out.println(res.val);
    }
}