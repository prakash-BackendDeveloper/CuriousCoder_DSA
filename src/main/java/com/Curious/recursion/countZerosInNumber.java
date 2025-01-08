package com.Curious.recursion;

public class countZerosInNumber {
    static int mod=0;
    static int cnt=0;
    public static void main(String[] args) {
        int n=20300009;
        System.out.println(countZeros(n));
    }
    public static int countZeros(int n) {
        if(n==0){
            return 1;
        }
        mod=n%10;
        if(mod==0){
            cnt++;
        }
        countZeros(n/10);
        return cnt;
    }
}
