package com.jetbrains;
import java.util.*;

class Solution {
    public void reverse(ListNode head) {
        if(head==null) {
            return;
        }
        // null -> a -> b -> c -> null
        //
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        while(curr.next!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2 = l2;
        while(h1.next!=null) {
            h1 = h1.next;
        }
        while(h2.next!=null) {
            h2 = h2.next;
        }

        reverse(l1);
        reverse(l2);

        ListNode res = new ListNode(0);
        ListNode res_start = res;

        int carry = 0;
        while(h1!=null && h2!=null) {
            int sum = h1.val + h2.val + carry;
            if(sum<10) {
                res.val = sum;
                carry = 0;
            }
            else {
                res.val = sum%10;
                carry = sum/10;
            }
            if(h1.next!=null && h2.next!=null) {
                ListNode next = new ListNode(0);
                res.next = next;
                res = next;
                h1 = h1.next;
                h2 = h2.next;
            }
            else if (h1.next!=null && h2.next==null) {
                ListNode next = new ListNode(0);
                res.next = next;
                res = next;
                h1 = h1.next;
                h2.val = 0;
            }
            else if (h1.next==null && h2.next!=null) {
                ListNode next = new ListNode(0);
                res.next = next;
                res = next;
                h2 = h2.next;
                h1.val = 0;
            }
            else if (h1.next==null && h2.next==null) {
                if(carry!=0) {
                    ListNode next = new ListNode(carry);
                    res.next = next;
                    res = next;
                }
                break;
            }

        }

        reverse(res_start);
        return res;
    }

    public ListNode addTwoNumbers_noRev(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        while(l1!=null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2!=null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        int sum = 0;
        ListNode end = new ListNode(0);

        while(!s1.empty() || !s2.empty()) {
            sum = end.val;
            if(!s1.empty()) {
                sum = sum + s1.pop();
            }
            if(!s2.empty()) {
                sum = sum + s2.pop();
            }
            end.val = sum%10;
            ListNode head = new ListNode(sum/10);
            head.next = end;
            end = head;
        }
        if(end.val==0) {
            return end.next;
        }
        return end;
    }


}