package com.Curious.mathBasics;

public class LastDigit_Divisibility {
    public static void main(String[] args) {

        //Reverse a number
        int n=34534543;
        while(n>0){
            int temp=n%10;
            System.out.print(temp+" ");
            n=n/10;
        }
        System.out.println();

        // First digit of a number
        int m=34534543;
        int lastDigit=0;
        while(m>0){
            lastDigit=m%10;
            m=m/10;
        }
        System.out.print(" First Digit is "+lastDigit+" ");
        System.out.println();

        // count digits
        int count=0;
        int x=9879;
        while(x>0){
            x=x/10;
            count=count+1;
        }
        System.out.print("Count Digits "+count+" ");
        System.out.println();

        // Count Odd digits of a number
        int od=0;
        int count1=0;
        int y=34534543;
        while(y>0){
            int ld=y%10;
            if(ld%2==1){
               count1=count1+1;
            }
            y=y/10;
        }
        System.out.println("Count Odd Digits "+count1+" ");


        //kth digit from right of ApowB
        int a=3,b=3,k=1,count2=0;
        double ans=0;
        ans=Math.pow(a,b);
        ans=Math.floor(ans);
        while(ans>0){
            int ld=(int) (ans%10);
            count2++;
            if(count2==k){
                System.out.println("kth digit is "+ld);
            }
            ans=ans/10;
        }
    }
}
