package com.Curious.javaBasics;

import java.util.Scanner;

public class PrintMultipleOfXtill1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i*x<=1000;i++){
            System.out.println(i*x);
        }
    }
}
