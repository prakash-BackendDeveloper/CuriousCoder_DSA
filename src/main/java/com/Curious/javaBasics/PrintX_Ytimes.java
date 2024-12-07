package com.Curious.javaBasics;

import java.util.Scanner;

public class PrintX_Ytimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < y; i++) {
            System.out.println(x);
        }
    }
}
