package com.leetcode.practice;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;  // Last valid number in nums1
            int j = n - 1;  // Last number in nums2
            int k = m + n - 1;  // Last position in nums1

            // Compare and place the bigger number at the end
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
                k--; // Move to the next position
            }

            // If anything is left in nums2, copy it
            while (j >= 0) {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
    }
}
