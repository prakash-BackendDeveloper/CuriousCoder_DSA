package com.Curious.javaBasics;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        System.out.println(n);
        System.out.println(s);
        System.out.println(ch);
    }
}
