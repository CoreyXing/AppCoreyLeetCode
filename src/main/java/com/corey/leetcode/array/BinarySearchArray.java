package com.corey.leetcode.array;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Xingweicheng
 * @description: 二分查找
 * @date: 2023/8/7 20:18
 */
public class BinarySearchArray {

    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target)
                right = mid - 1;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                return mid;
        }
        return -1;
    }


    public static void main(String[] args) {
        //main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组长度");
        int len = scanner.nextInt();
        System.out.println("输入有序数组值");
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("输入目标值");
        int target = scanner.nextInt();
        int bus = new BinarySearchArray().binarySearch(nums, target);
        System.out.println("位置在" + bus);
    }
}
