package com.Curious.recursion;

public class GivenarrayIsSortedOrNotUsingRecursion {
    public static void main(String[] args) {
        int a[]={5,6,3,2,1};
        System.out.println(isSorted(a,a.length-1));
    }
    static boolean isSorted(int a[],int n){
        if(n==0){
            return true;
        }
        if(n-1 >=0 && a[n]<a[n-1]){
            return false;
        }
        return isSorted(a,n-1);
    }
}
