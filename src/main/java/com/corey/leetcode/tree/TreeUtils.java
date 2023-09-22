package com.corey.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author I585034
 * @description: 二叉树操作工具类
 * @date 2023/8/9 16:10
 */
public class TreeUtils {
    /**
     * 二叉树中序遍历--递归
     */
    public static void midOrderTraversalRecursion(Tree node, TraversalOperate operate) {
        if (node == null) {
            return;
        }
        midOrderTraversalRecursion(node.left, operate);
        operate.operate(node);
        midOrderTraversalRecursion(node.right, operate);
    }

    /**
     * 二叉树先序遍历--递归
     */
    public static void firstOrderTraversalRecursion(Tree node, TraversalOperate operate) {
        if (node == null) {
            return;
        }
        operate.operate(node);
        firstOrderTraversalRecursion(node.left, operate);
        firstOrderTraversalRecursion(node.right, operate);
    }

    /**
     * 二叉树后续遍历--递归
     */
    public static void postOrderTraversalRecursion(Tree node, TraversalOperate operate) {
        if (node == null) {
            return;
        }
        postOrderTraversalRecursion(node.left, operate);
        postOrderTraversalRecursion(node.right, operate);
        operate.operate(node);
    }


    public static <T> Tree createTree(T[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Tree<T> root = new Tree<>(arr[0]);
        Queue<Tree<T>> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < arr.length) {
            Tree<T> node = queue.poll();
            // 创建左子节点
            if (arr[i] != null) {
                node.left = new Tree<T>(arr[i]);
                queue.offer(node.left);
            }
            i++;
            if (i >= arr.length) {
                break;
            }
            // 创建右子节点
            if (arr[i] != null) {
                node.right = new Tree(arr[i]);
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }

    /*
     * @description:
            * @params: node
            * @return: null
            * @author: xingweicheng
            * @dateTime: 2023/8/10 23:15
            * 二叉树的层序遍历
     */

    public static  void levelOrder(Tree node,TraversalOperate operate){
        if (node == null){
            return;
        }
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            Tree temp = queue.poll();
            operate.operate(temp);
            if (temp.left != null){
                queue.offer(temp.left);
            }
            if (temp.right != null){
                queue.offer(temp.right);
            }
        }
    }

    /*
     * @description:
            * @params:
            * @return: null
            * @author: xingweicheng
            * @dateTime: 2023/8/10 23:16
     */
    public static void invertTree(Tree node){
        if (node == null){
            return;
        }
        invertTree(node.left);
        invertTree(node.right);
        swapChildren(node);
    }

    private static void swapChildren(Tree root) {
        Tree tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }




    public static void main(String[] args) {
        Tree<Integer> root = createTree(new Integer[]{1,null,5,7,9,11});
        firstOrderTraversalRecursion(root, new TraversalOperate() {
            @Override
            public void operate(Tree node) {
                System.out.println(node);
            }
        });

        levelOrder(root, new TraversalOperate() {
            @Override
            public void operate(Tree node) {
                System.out.println(node);
            }
        });
    }


}
