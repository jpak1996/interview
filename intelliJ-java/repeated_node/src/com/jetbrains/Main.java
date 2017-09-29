package com.jetbrains;
import java.util.*;

public class Main {
    public static node find_repeat(node head) {
        HashSet<node> s = new HashSet<node>();
        while(head!=null) {
            if(s.contains(head)) {
                return head;
            }
            else {
                s.add(head);
                head = head.next;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        node a = new node(0);
        node b = new node(1);
        node c = new node(2);
        node d = new node(3);
        node e = new node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = c;

        node res = find_repeat(a);
        if (res!=null) {
            System.out.println(res.data);
        }
        else {
            System.out.println("no duplicates");
        }
    }
}
