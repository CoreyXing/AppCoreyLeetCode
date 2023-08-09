package com.corey.leetcode.tree;

/**
 * @author I585034
 * @description: 二叉树操作工具类
 * @date 2023/8/9 16:10
 */
public class TreeUtils {
    /**
     *  二叉树中序遍历--递归
     */
   public static void midOrderTraversalRecursion(Tree node,TraversalOperate operate){
        if (node == null){
            return;
        }
        midOrderTraversalRecursion(node.left,operate);
        operate.operate(node);
        midOrderTraversalRecursion(node.right, operate);
    }

    /**
     *  二叉树先序遍历--递归
     */
    public static void firstOrderTraversalRecursion(Tree node,TraversalOperate operate){
        if (node == null){
            return;
        }
        operate.operate(node);
        firstOrderTraversalRecursion(node.left,operate);
        firstOrderTraversalRecursion(node.right, operate);
    }

    /**
     *  二叉树后续遍历--递归
     */
    public static void postOrderTraversalRecursion(Tree node,TraversalOperate operate){
        if (node == null){
            return;
        }
        postOrderTraversalRecursion(node.left,operate);
        postOrderTraversalRecursion(node.right, operate);
        operate.operate(node);
    }


    public static <T> Tree createTree(T[] arrays){

    }


}
