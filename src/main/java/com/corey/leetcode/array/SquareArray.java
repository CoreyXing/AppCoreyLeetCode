package com.corey.leetcode.array;


/**
 * 双指针
 */
public class SquareArray {
    private static int[] squareArray(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int[] newNums= new int[nums.length];
        for (int i = newNums.length-1; i>=0; i--) {
            if (Math.pow(nums[left],2)>Math.pow(nums[right],2)){
                newNums[i]= (int) Math.pow(nums[left],2);
                left++;
            }else {
                newNums[i]=(int) Math.pow(nums[right],2);
                right--;
            }
        }
        return newNums;
    }

    public static void main(String[] args) {
        int[] nums={-8,-2,2,4,6,8};
        int[] newNums = squareArray(nums);
        for (int num:newNums) {
            System.out.println(num);
        }

    }
}

