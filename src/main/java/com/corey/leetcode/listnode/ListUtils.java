package com.corey.leetcode.listnode;


/**
 * @author I585034
 * @description: 链表工具类
 * @date 2023/8/8 17:06
 */
public class ListUtils {

    public static ListNode createList(int[] nums) {
        int i = 0;
        ListNode pre = null;
        ListNode head = null;
        while (i < nums.length) {
            ListNode temp = new ListNode(nums[i]);
            if (pre != null) {
                pre.next = temp;
                head = temp;
            }
            pre = temp;
        }
        return head;
    }

    /**
     * 头插法
     *
     * @param head
     * @return 是否插入成功
     */
    public static boolean addNode2Head(ListNode head, int value) {
        if (head == null) {
            head = new ListNode(value);
            return true;
        } else {
            ListNode tempNode = new ListNode(value);
            tempNode.next = head;
            head = tempNode;
            return true;
        }
    }

    /**
     * 链表尾插法
     *
     * @param head
     * @param value
     * @return 是否插入成功
     */
    public static boolean addNode2Tail(ListNode head, int value) {
        if (head == null) {
            head = new ListNode(value);
            return true;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(value);
            return true;
        }
    }


    public static int[] listNode2Array(ListNode head) {
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

    public static boolean removeElement(ListNode head, int val) {
        if (head == null) {
            return false;
        }
        if (head.val == val)
            head = head.next;
        ListNode pre = head;
        ListNode temp = head.next;
        while (temp != null) {
            if (temp.val == val) {
                pre.next = temp.next;
                temp = temp.next;
            } else {
                pre = temp;
                temp = temp.next;
            }
        }
        return true;
    }

    public static int getAtIndex(ListNode head, int index) {
        while (head == null) {
            return -1;//表示链表为空
        }
        ListNode temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }
        return temp.val;
    }


    public static int getLengthOfListNode(ListNode head) {
        if (head == null) {
            return 0;
        }
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }


    public static boolean removeAtIndexOfListNode(ListNode head, int value) {

        if (head == null) {
            return false;
        }
        if (value == 0) {
            head = head.next;
            return true;
        }
        ListNode temp = head.next;
        ListNode pre = head;
        int res = 0;
        if (value > getLengthOfListNode(head)) {
            return false;//不可能移除比链表长的元素
        }
        while (value > 0) {
            pre = temp;
            temp = temp.next;
            value--;
        }
        pre.next = temp.next;
        return true;
    }


    public static ListNode getTailValueOfListNode(ListNode head) {
        if (head == null) {
            return null;//链表为空
        }
        ListNode temp = head;
        ListNode pre = temp;
        temp = temp.next;
        while (temp != null) {
            pre = temp;
            temp = temp.next;
        }
        return pre;
    }

    public static void printListNode(ListNode head){
        if (head == null){
            return ;
        }
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
        }
    }

}
