package com.jetbrains;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        if(root==p || root==q || root==null) {
            return root;
        }
        else {
            TreeNode a = lowestCommonAncestor(root.left, p, q);
            TreeNode b = lowestCommonAncestor(root.right, p, q);

            if(a!=null && b!=null) {
                return root;
            }
            if(a==null && b!=null) {
                return b;
            }
            else if(b==null && a!=null) {
                return a;
            }
            else {
                return null;
            }
        }

    }
}
