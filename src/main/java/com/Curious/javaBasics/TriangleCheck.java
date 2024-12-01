package com.Curious.javaBasics;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=sc.nextInt();
        if(n+m+o==180){
            System.out.println("Triangle can be Formed");
        }
        else{
            System.out.println("Triangle can not be Formed");
        }
    }
}
