package com.jetbrains;

public class node {

    node next = null;
    node prev = null;
    int data;

    public node(int a) {
        this.data = a;
    }
//    public void next(node b) {
//        this.next = b;
//    }
//    public void prev(node a) {
//        this.prev = a;
//    }
//    public void delete_node() {
//        if(this.prev!=null) {
//            this.prev.next = this.next;
//        }
//        if(this.next!=null) {
//            this.next.prev = this.prev;
//        }
//    }

    //    public void delete_node() {
//        if(this.next!=null) {
//            this.next = next.next;
//            this.prev = this;
//            this.data = next.data;
//        }
//    }
    /*
    2 -> 4 -> 4 -> 4 -> 10
     */
    public void delete_node() {
        if(this.next!=null) {
            System.out.println("current: "+this.data);
            System.out.println("prev: "+this.prev.data);
            System.out.println("next: "+this.next.data);
            this.data = next.data;
            this.next = next.next;
            if(this.next != null ) {
                this.next.prev = this;
            }
        }
        else if(this.prev!=null) {
            this.data = prev.data;
            this.prev = prev.prev;
            if(this.prev!=null) {
                this.prev.next = this;
            }


        }
    }

}
