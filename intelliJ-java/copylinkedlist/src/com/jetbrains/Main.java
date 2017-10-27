package com.jetbrains;

public class Main {
    public static class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }
    // a -> null
    // a -> b -> null
//    public static RandomListNode copy(RandomListNode head) {
//        RandomListNode a = new RandomListNode(head.label);
//        RandomListNode pointer = a;
//        if(pointer==null) {
//            return a;
//        }
//        else {
//            a.next = head.next;
//            a.random = head.random;
//            pointer.next = head.next;
//            while (pointer.next != null) {
//                RandomListNode b = new RandomListNode(pointer.next.label);
//                b.next = pointer.next.next;
//                b.random = pointer.next.random;
//                pointer = pointer.next;
//            }
//            return a;
//        }
//    }
    public static RandomListNode copy(RandomListNode head) {
        if(head!=null) {
            RandomListNode head_copy = new RandomListNode(head.label);
            RandomListNode head_ret = head_copy;
            head = head.next;
            while(head!=null) {
                RandomListNode copy = new RandomListNode(head.label);
                head_copy.next = copy;
                head = head.next;
                head_copy = head_copy.next;
            }
            head_copy.next = null;
            return head_ret;
        }
        else {
            return null;
        }
    }
    public static void main(String[] args) {
	// write your code here
//        RandomListNode a = new RandomListNode(1);
//        RandomListNode b = new RandomListNode(2);
//        RandomListNode c = new RandomListNode(4);
//        a.next = b;
//        b.next = c;
//        RandomListNode a_copy = copy(a);
//        a.label = 4;
//        a.label = 5;
//        a.label = 6;
//        while(a_copy!=null) {
//            System.out.println(a_copy.label);
//            a_copy = a_copy.next;
//        }
        Node head = new Node(1);
        Node head1 = new Node(2);
        Node head2 = new Node(3);

        head.next = head1;
        head1.next = head2;

        Node head_copy = Node.copy(head);
        head.val = 2;

        while(head_copy!=null) {
            System.out.println(head_copy.val);
            head_copy = head_copy.next;
        }


    }
}
