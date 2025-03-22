package com.leetcode.practice;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        mergeSortedArray solution = new mergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}

