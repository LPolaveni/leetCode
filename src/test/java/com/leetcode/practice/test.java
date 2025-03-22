package com.leetcode.practice;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        // Program-1: Merge Sorted Array
        MergeSortedArray solution = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);
        System.out.println("Merged Array: " + Arrays.toString(nums1));

        // Program-2: Remove Element
        RemoveElement removeElement = new RemoveElement();
        int[] nums3 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = removeElement.removeElement(nums3, val1);
        System.out.print("Remove Element Output: " + k1 + ", nums = [");
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

        // Program-3: Remove Duplicates from Sorted Array
        RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();
        int[] nums4 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates.removeDuplicates(nums4);
        System.out.print("Remove Duplicates Output: " + k2 + ", nums = [");
        for (int i = 0; i < nums4.length; i++) {
            if (i < k2) {
                System.out.print(nums4[i]); // Print unique elements
            } else {
                System.out.print("_"); // Represent ignored elements with _
            }
            if (i < nums4.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
