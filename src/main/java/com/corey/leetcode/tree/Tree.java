package com.corey.leetcode.tree;

/**
 * @author I585034
 * @description: 二叉树定义
 * @date 2023/8/9 16:03
 */
public class Tree<T> {

    T val;

    Tree left;

    Tree right;

    public Tree(T val, Tree left, Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Tree(T val) {
        this.val = val;
    }

    public Tree() {
    }

    @Override
    public String toString() {
        return "TreeNode "+ this.val.toString();
    }
}
