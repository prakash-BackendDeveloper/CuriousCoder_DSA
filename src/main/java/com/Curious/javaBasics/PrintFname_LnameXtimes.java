package com.Curious.javaBasics;

import java.util.Scanner;

public class PrintFname_LnameXtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        String lname = sc.next();
        int x = sc.nextInt();
        for(int i = 0 ; i < x ; i++){
            System.out.println(fname + "" + lname);
        }
    }
}
