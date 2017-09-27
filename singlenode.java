package com.jetbrains;


public class singlenode {

    singlenode next = null;
    int data;

    public singlenode(int a) {
        this.data = a;
    }
    public void next(singlenode b) {
        this.next = b;
    }

    public void delete_singlenode() {
        if(this.next!=null) {
            this.data = next.data;
            this.next = next.next;
        }
    }

}