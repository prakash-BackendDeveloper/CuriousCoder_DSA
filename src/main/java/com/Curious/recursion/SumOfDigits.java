package com.Curious.recursion;

public class SumOfDigits {
    static int mod=0;
    static int sum=0;
    public static void main(String[] args) {
        int n=34534;
        System.out.println(sumDigit(n));
    }
    public static int sumDigit(int n) {
        if(n==0){
            return 0;
        }
        sum=sum+n%10;
        sumDigit(n/10);
        return sum;
    }

}
