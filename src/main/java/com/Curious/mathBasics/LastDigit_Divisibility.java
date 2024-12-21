package com.Curious.mathBasics;

public class LastDigit_Divisibility {
    public static void main(String[] args) {
        int n=34534543;
        while(n>0){
            int temp=n%10;
            System.out.print(temp+" ");
            n=n/10;
        }
    }
}
