package com.leetcode.practice;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        // Program-1
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));


        //Program-2
        RemoveElement removeElement = new RemoveElement();
        // Example 1
        int[] nums3 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = removeElement.removeElement(nums3, val1);
        System.out.print("Output: " + k1 + ", nums = [");
        for (int i = 0; i < nums3.length; i++) {
            if (i < k1) {
                System.out.print(nums3[i]); // Print valid elements
            } else {
                System.out.print("_"); // Represent ignored elements with _
            }
            if (i < nums3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}

