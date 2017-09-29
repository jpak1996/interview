package com.jetbrains;

public class Main {

    public static node add(node a, node b) {

        node head = new node(0);
        node res = head;

        while(true) {

            int num, carry, remainder;
            if(a!=null && b!=null) {
                num = a.data + b.data + res.data;
                if(num<10) {
                    res.data = num;
                    if(a.next!=null || b.next!=null) {
                        node cont = new node(0);
                        res.next = cont;
                        res = res.next;
                        a = a.next;
                        b = b.next;
                    }
                    else {
                        return head;
                    }
                }
                else {
                    carry = num/10;
                    remainder = num%10;
                    res.data = remainder;

                    node cont = new node(carry);
                    res.next = cont;
                    res = res.next;
                    a = a.next;
                    b = b.next;
                }

            }
            else if(a!=null) {
                num = a.data+res.data;
                if(num<10) {
                    res.data = num;
                    if(a.next!=null) {
                        node cont = new node(0);
                        res.next = cont;
                        res = res.next;
                        a = a.next;
                    }
                    else {
                        return head;
                    }
                }
                else {
                    carry = num/10;
                    remainder = num%10;
                    node cont = new node(carry);
                    res.data = remainder;
                    res.next = cont;
                    res = res.next;
                    a = a.next;
                }


            }
            else if(b!=null) {
                num = b.data+res.data;
                if(num<10) {
                    if(b.next!=null) {
                        node cont = new node(0);
                        res.next = cont;
                        res = res.next;
                        b = b.next;
                    }
                    else {
                        return head;
                    }
                }
                else {
                    carry = num/10;
                    remainder = num%10;
                    res.data = remainder;
                    node cont = new node(carry);
                    res.next = cont;
                    res = res.next;
                    b = b.next;
                }

            }
            else {
                return head;
            }

        }
    }
    public static node recursive_add(node a, node b, int carry) {
        int num;
        node cur, res;
        if(a!=null && b!=null) {
            num = a.data + b.data + carry;
            if(num<10) {
                cur = new node(num);
                res = recursive_add(a.next, b.next, 0);
            }
            else {
                int c = num/10;
                int remainder = num%10;
                cur = new node(remainder);
                res = recursive_add(a.next, b.next, c);
            }

        }
        else if (a!=null) {
            num = a.data + carry;
            if(num<10) {
                cur = new node(num);
                res = recursive_add(a.next, null, 0);
            }
            else {
                int c = num/10;
                int remainder = num%10;
                cur = new node(remainder);
                res = recursive_add(a.next, null, c);
            }
        }
        else if (b!=null) {
            num = + b.data + carry;
            if(num<10) {
                cur = new node(num);
                res = recursive_add(null, b.next, 0);
            }
            else {
                int c = num/10;
                int remainder = num%10;
                cur = new node(remainder);
                res = recursive_add(null, b.next, c);
            }
        }
        else {
            if (carry==0)
                return null;
            else {
                res = new node(carry);
                return res;
            }
        }
        cur.next = res;
        return cur;

    }
    public static void main(String[] args) {
	// write your code here
        node a = new node(6);
        node aa = new node(5);
        node aaa = new node(9);
        a.next = aa;
        aa.next = aaa;

        node b = new node(7);
        node bb = new node(1);
        node bbb = new node(9);
        b.next = bb;
        bb.next = bbb;


        node res = recursive_add(a, b, 0);
        while(res!=null) {
            System.out.println(res.data);
            res = res.next;
        }






    }
}
