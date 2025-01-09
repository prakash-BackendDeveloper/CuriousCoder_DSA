package com.Curious.recursion;

public class IsTargetPresentInArrayUsingRecursion {
    public static void main(String[] args) {
        int a[]={3,567,5,6,879};
        int target=879;
        System.out.println(findTarget(a,target, a.length-1));
    }
    public static boolean findTarget(int[] a, int target , int len) {
        if(len<=0) return false;
        if(a[len]==target) return true;
        return findTarget(a, target, len-1);
    }
}
