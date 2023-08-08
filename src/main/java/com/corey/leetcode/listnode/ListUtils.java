package com.corey.leetcode.listnode;

/**
 * @author I585034
 * @description: 链表工具类
 * @date 2023/8/8 17:06
 */
public class ListUtils {

    public static ListNode createList(int[] nums){
        int i=0;
        ListNode pre = null;
        ListNode head = null;
        while (i< nums.length){
            ListNode temp = new ListNode(nums[i]);
            if (pre != null){
                pre.next = temp;
                head = temp;
            }
            pre = temp;
        }
        return  head;
    }
}
