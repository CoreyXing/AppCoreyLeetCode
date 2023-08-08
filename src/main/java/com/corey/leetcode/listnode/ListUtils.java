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

    /**
     * 头插法
     * @param head
     * @return 是否插入成功
     */
    public static boolean addNode2Head(ListNode head,int value){
        if (head == null){
            head= new ListNode(value);
            return true;
        }else{
            ListNode tempNode = new ListNode(value);
            tempNode.next=head;
            head=tempNode;
            return true;
        }
    }

    /**
     * 链表尾插法
     * @param head
     * @param value
     * @return 是否插入成功
     */
    public static  boolean addNode2Tail(ListNode head,int value){
        if (head == null){
            head = new ListNode(value);
            return true;
        }else{
            ListNode temp =head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=new ListNode(value);
            return true;
        }
    }


}
