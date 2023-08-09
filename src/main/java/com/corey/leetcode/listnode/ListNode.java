package com.corey.leetcode.listnode;

/**
 * @author I585034
 * @description: 链表定义
 * @date 2023/8/8 17:01
 */
public class ListNode {

    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node" + this.val;
    }



}
