package com.Curious.recursion;

public class SumOfArrayUsingRecursion {
    static int sum=0;
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(sumArray(a,a.length-1));
    }
    static int sumArray(int a[],int n) {
        if(n<0) {
            return 0;
        }
        sum+=a[n];
        sumArray(a,n-1);
        return sum;
    }
}
