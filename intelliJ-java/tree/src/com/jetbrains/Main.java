package com.jetbrains;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(3);
        a.left = b;
        a.right = c;
        System.out.println(Solution.isAncestor(d, a));
    }
}
