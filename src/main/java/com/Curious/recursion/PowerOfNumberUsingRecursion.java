package com.Curious.recursion;

public class PowerOfNumberUsingRecursion {
    public static void main(String[] args) {
        int number=5;
        int times=2;
        System.out.println(power(number,times));
    }
    public static int power(int number,int times) {
        if(times==0){
            return 1;
        }
        return number*power(number,times-1);
    }
}
