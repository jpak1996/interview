package com.jetbrains;


public class Main {

//    public static int find_nth_to_last(node head, int n) {
//        int counter = 0;
//        while(head!=null) {
//            head = head.next;
//            counter += 1;
//        }
//        //counter is now the number of nodes there are
//        return counter - n;
//    }

    public static node find_nth_to_last(node head, int n) {
        node first = head;
        node second = head;
        for(int i=0; i<n-1; i++) {
            second = second.next;
        }
        //difference between first and second is now n.
        while(second.next!=null) {
            first = first.next;
            second = second.next;
        }
        return first;
    }

    public static void main(String[] args) {
	// write your code here
        node a = new node('a');
        node b = new node('b');
        node c = new node('c');
        node d = new node('d');

        a.next = b;
        b.next = c;
        c.next = d;

        b.prev = a;
        c.prev = b;
        d.prev = c;

        node nth_last = find_nth_to_last(a, 3);

        System.out.println(nth_last.data);
    }
}
