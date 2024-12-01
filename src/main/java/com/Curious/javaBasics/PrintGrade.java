package com.Curious.javaBasics;

import java.util.Scanner;

public class PrintGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=90){
            System.out.println("Grade A");
        }
        else if(n<=80){
            System.out.println("Grade B");
        }
        else if(n<=60){
            System.out.println("Grade C");
        }
        else if(n<=35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
