package com.jetbrains;

public class node {
    char data;
    node next = null;
    node prev = null;
    public node(char d) {
        data = d;
    }

    public void remove() {
        if (this!=null) {
            node p = this.prev;
            node n = this.next;
            if(p!=null) {
                p.next = n;
            }
            if(n!=null) {
                n.prev = p;
            }
        }
        this.next = null;
        this.prev = null;
    }

//    public static void remove(node a) {
//        if (a!=null) {
//            node p = a.prev;
//            node n = a.next;
//            if(p!=null) {
//                p.next = n;
//            }
//            if(n!=null) {
//                n.prev = p;
//            }
//        }
//    }
}
