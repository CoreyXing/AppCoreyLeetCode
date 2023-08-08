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

    public static int[] listNode2Array(ListNode head){
        // 首先计算链表的长度
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        // 创建一个与链表长度相同的数组
        int[] arr = new int[length];
        // 将链表元素存储到数组中
        current = head;
        int index = 0;
        while (current != null) {
            arr[index++] = current.val;
            current = current.next;
        }
        return arr;
    }
}
