package com.corey.leetcode.array;

/**
 * @author I585034
 * @description: leetcode209 最小子数组
 * @date 2023/8/8 15:15
 */
public class SmallestLengthSubarray {
    //暴力
    private static int minSubArrayLen(int[] nums,int target){
        int minlen=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j=i;j<nums.length;j++){
                sum+=nums[j];
                if (sum>=target){
                    minlen=minlen<j-i+1?minlen:j-i+1;
                    break;
                }
            }
        }
        return minlen;
    }

    private static int minSubArrayLenWindows(int[] nums,int target){
        int sum=0;
        int j=0;
        int minlen=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while (sum>=target){
                minlen=minlen>i-j+1?i-j+1:minlen;
                sum-=nums[j++];
            }
        }
        return minlen;
    }

    public static void main(String[] args) {
        int[] nums =new int[]{2,3,1,2,4,3};

        System.out.println(minSubArrayLen(nums,7));


        System.out.println(minSubArrayLenWindows(nums,7));

    }
}
