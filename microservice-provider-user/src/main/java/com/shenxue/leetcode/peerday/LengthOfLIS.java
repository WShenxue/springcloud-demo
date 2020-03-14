package com.shenxue.leetcode.peerday;

/**
 * No.300 最长上升子序列
 * 2020-03-14
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度
 *
 */
public class LengthOfLIS {

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = lengthOfLIS(nums);
        System.out.println(result);
    }

    private static int lengthOfLIS(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        // Input:[0], Output:1
        int result = 1;
        int temp[] = new int[nums.length];
        for (int i = 1; i < nums.length; i++ ) {
            temp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && temp[j] + 1 > temp[j]) {
                    temp[i] = temp[j] + 1;
                }
            }
            result = Math.max(result, temp[i]);

        }
        return result;
    }
}
