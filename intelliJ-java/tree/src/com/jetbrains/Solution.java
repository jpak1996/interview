package com.jetbrains;

public class Solution {
    public static boolean isAncestor(TreeNode descendant, TreeNode ancestor) {
        if(ancestor!=null) {
            if(ancestor==descendant) {
                return true;
            }
            else {
                return ( isAncestor(descendant, ancestor.left) || isAncestor(descendant, ancestor.right) );
            }
        }
        else {
            return false;
        }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         while(true) {
             if( isAncestor(p, root.left) && isAncestor(q, root.left) ) {
                 root = root.left;
             }
             else if( isAncestor(p, root.right) && isAncestor(q, root.right) ) {
                 root = root.right;
             }
             else {
                 return root;
             }
         }
    }
}
