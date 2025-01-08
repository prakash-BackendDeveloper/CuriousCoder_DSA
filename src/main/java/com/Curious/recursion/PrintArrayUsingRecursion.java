package com.Curious.recursion;

public class PrintArrayUsingRecursion {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        printArray(a,a.length-1);
    }
    public static void printArray(int[] a,int n) {
        if(n==0) {
            System.out.print(a[0]+" ");
            return;
        }
        printArray(a,n-1);
        System.out.print(a[n]+" ");
    }
}
