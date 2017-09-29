package com.jetbrains;

public class node {
    node prev = null;
    node next = null;
    int data;
    public node(int d) {
        data = d;
    }
    public void delete() {
        if(this.next!=null) {
            this.next.prev = this.prev;
        }
        if(this.prev!=null) {
            this.prev.next = this.next;
        }
    }
}
