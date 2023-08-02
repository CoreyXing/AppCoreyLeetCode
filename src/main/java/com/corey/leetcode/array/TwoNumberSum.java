package com.corey.leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: Xingweicheng
 * @description: 两束之和,leetcode第一题
 * @date: 2023/8/3 7:37
 */
public class TwoNumberSum {
    private int[] twoSum(int[] nums,int target){
        int[] ans=new int[2];
        Map<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }else {
                ans[0]=i;
                ans[1]=map.get(target-nums[i]);
                return ans;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("输入数组的长度");
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        int[] array=new int[length];
        System.out.println("输入数组中的元素");
        for (int i = 0; i < length; i++) {
            array[i]=scanner.nextInt();
        }
        int[] ans=new TwoNumberSum().twoSum(array,9);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
