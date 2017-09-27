package com.jetbrains;
import java.util.*;

public class Main {
//    public static void remove_duplicates(node head) {
//        ArrayList<Integer> nodes = new ArrayList<Integer>();
//        node cur = head;
//        int d;
//        while(cur!=null) {
//            d = cur.data;
//            if(nodes.contains(d)) {
//                cur.delete_node();
//            }
//            else {
//                nodes.add(d);
//            }
//            cur = cur.next;
//        }
//    }

    public static void remove_duplicates(node head) {
        HashSet<Integer> nodes = new HashSet<Integer>();
        while(head!=null) {
            if(nodes.contains(head.data)) {
                head.delete_node();
            }
            else {
                nodes.add(head.data);
                head = head.next;
            }

        }
    }

    //    public static void remove_duplicates(node head) {
//        if(head.next!=null) {
//            node a = head;
//            node b = head.next;
//            while(a!=null) {
//                while(b!=null) {
//                    if(a.data==b.data) {
//                        b.delete_node();
//                    }
//                    b = b.next;
//                }
//                a = a.next;
//            }
//        }
//
//    }
    public static void main(String[] args) {
        // write your code here
        node a = new node(2);
        node b = new node(4);
        node c = new node(4);
        node d = new node(4);
        node e = new node(10);

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        remove_duplicates(a);

        node cur = a;
        while(cur!=null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
        String str = "initial value";
        String str2 = str;
        str2 = "changed value";
        System.out.println(str);

        int a1 = 1;
        int a2 = a1;
        a2 = 2;
        System.out.println(a1);

        node test = new node(1);
        node test2 = test;
        test2.data = 10000;
        System.out.println(test.data);

    }
}
