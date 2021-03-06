package com.jetbrains;

public class Node {
    int val;
    Node next;
    Node(int x) {
        this.val = x;
    }
    public static Node copy(Node head) {
        if(head==null) return head;
        Node a = new Node(head.val);
        Node r = a;
        head = head.next;
        while(head!=null) {
            Node b = new Node(head.val);
            a.next = b;
            a = b;
            head = head.next;
        }
        return r;
    }
}
