package com.Curious.recursion;

public class countDigits {
    static int mod=0;
    static int cnt=0;
    public static void main(String[] args) {
        int n=35344;
        System.out.println(countDigit(n));
    }
    public static int countDigit(int n) {
        if(n==0){
            return 1;
        }
        mod=n%10;
        if(mod>0){
            cnt=cnt+1;
        }
        countDigit(n/10);
        return cnt;
    }
}
