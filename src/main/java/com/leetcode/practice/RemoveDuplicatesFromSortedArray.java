package com.leetcode.practice;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: Empty array

        int k = 1; // Pointer for unique elements (first element is always unique)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check if the current element is unique
                nums[k] = nums[i]; // Place unique element at index k
                k++; // Move the pointer
            }
        }
        return k; // Return the count of unique elements
    }
}
