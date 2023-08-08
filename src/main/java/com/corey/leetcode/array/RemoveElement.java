package com.corey.leetcode.array;

import java.util.Arrays;

/**
 * @author: Xingweicheng
 * @description: 移除元素
 * @date: 2023/8/7 21:25
 */
public class RemoveElement {
    private int removeElement(int[] nums,int target){
        int slowIndex=0,fastIndex=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[fastIndex]!=target){
                nums[slowIndex++]=nums[fastIndex++];
            }else {
                fastIndex++;
            }
        }
        return slowIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,3,5,7,3,3};
        int res = new RemoveElement().removeElement(nums,3);
        int[] newNums=Arrays.copyOf(nums,res);
        for (int num: newNums) {
            System.out.println(num);
        }

    }
}
