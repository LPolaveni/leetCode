package com.leetcode.practice;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place valid element at index k
                k++; // Move pointer
            }
        }
        return k; // k is the count of valid elements
    }
}
