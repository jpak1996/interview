package com.jetbrains;

public class Main {
    // copy method
    public static boolean remove_node(node a) {
        node b = a.next;
        if(b==null) {
            return false;
        }
        else {
            a.data = b.data;
            a.next = b.next;
            return true;
        }
    }
    // delete last node
    public static boolean remove_last_node(node a) {

        node b = a.next;
        if(b==null) {
            return false;
        }
        else {
            if (b.next==null) {
                a.next = null;
                return true;
            }
            else {

                while(b.next.next!=null) {
                    b = b.next;
                }
                b.next = null;
                return true;
            }

        }
    }

    public static void main(String[] args) {
	// write your code here
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);

        a.next = b;
        b.next = c;

        if( remove_node(c) ) {
            System.out.println("node deleted");
        }
        else {
            remove_last_node(c);
            System.out.println("node not deleted");
        }

        node head = a;
        while(head!=null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
