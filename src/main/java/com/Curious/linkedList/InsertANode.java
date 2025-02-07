package com.Curious.linkedList;

import org.w3c.dom.Node;

import java.util.Scanner;

 class ListNode {
    int data;
    ListNode next;
}
public class InsertANode {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            ListNode head = null;
            ListNode temp = null;
            int n = 5;
            while (n > 0) {
                if (head == null) {
                    head = new ListNode();
                    head.data = sc.nextInt();
                    head.next = null;
                    temp = head;
                } else {
                    ListNode nn = new ListNode();
                    nn.data = sc.nextInt();
                    nn.next = null;
                    temp.next = nn;
                    temp = temp.next;
                }
                n--;
            }
            temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
