package com.corey.leetcode.listnode;

/**
 * @author: Xingweicheng
 * @description: Leetcode 206 反转链表
 * @date: 2023/8/9 9:18
 */
public class ReverseListNode {

    private static void reverseListNode(ListNode head){
        if (head == null){
            return ;
        }
        ListNode temp = head;
        ListNode pre=null;
        while(temp != null){
            ListNode tempNext=temp.next;
            temp.next=pre;
            pre=temp;
            temp = tempNext;
        }
        head = pre;

    }

    public static void main(String[] args) {

        ListNode listNode = ListUtils.createList(new int[]{1, 2, 4, 6, 7});
        ListUtils.printListNode(listNode);
        reverseListNode(listNode);
        ListUtils.printListNode(listNode);
    }

}
