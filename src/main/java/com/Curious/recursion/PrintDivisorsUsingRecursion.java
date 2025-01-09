package com.Curious.recursion;

public class PrintDivisorsUsingRecursion {
    public static void main(String[] args) {
        int n=12;
        int sqrt=(int) Math.sqrt(n);
        printDivisors(1,sqrt,n); // O(sqrt(n))
        System.out.println();
        printDivisors1(1,n); //O(n)
    }
    public static void printDivisors(int cnt,int sqrt,int n){
        if(cnt>sqrt){
            return;
        }
        if(n%cnt==0){
            System.out.print(cnt+" ");
            System.out.print((n/cnt)+" ");
        }
        cnt++;
        printDivisors(cnt,sqrt,n);
    }
    public static void printDivisors1(int cnt,int n){
        if(cnt>n){
            return;
        }
        if(n%cnt==0){
            System.out.print(cnt+" ");
        }
        cnt++;
        printDivisors1(cnt,n);
    }
}
