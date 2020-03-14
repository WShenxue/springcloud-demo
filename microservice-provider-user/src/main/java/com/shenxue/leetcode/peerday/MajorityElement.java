package com.shenxue.leetcode.peerday;

import java.util.HashMap;
import java.util.Map;

/**
 * NO.169 多数元素
 * 2020-03-13
 * 给定大小为n的数组，找到其中的多数元素
 * 【多数元素】数组中出现次数大于[n/2]的元素
 * 假设数组是非空，且总数存在多多数元素
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> maps = new HashMap<>();
        int resultCount = 0;
        int resultNum = nums[0];
        for (int i = 0 ; i< nums.length; i++) {
            int tempVal = 1;
            if (maps.containsKey(nums[i])) {
                tempVal = maps.get(nums[i]) + 1;
            }
            maps.put(nums[i], tempVal);
            if (tempVal > resultCount) {
                resultNum = nums[i];
                resultCount = tempVal;
            }

        }
        return resultNum;
    }
}
