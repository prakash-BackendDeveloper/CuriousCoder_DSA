package com.Curious.mathBasics;

public class palindromeNumber {
    public static void main(String[] args) {

        //Reverse a number
        int n = 987987, sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum = sum * 10 + ld;
            n = n / 10;
        }
        System.out.println(sum);


        //Factorial
        int m = 9, sum1 = 1;
        for (int i = 1; i <= m; i++) {
            sum1 += sum1 * i;
        }
        System.out.println(sum1);


        //Prime Number
        int o =11, count = 0;
        while (o > 0) {
            count=0;
            for (int j = 1; j * j <= o; j++) {
                if (o % j == 0) {
                    if (j * j == o) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
                if (count > 2) {
                    break;
                }
            }
            if (count == 2) {
                System.out.println(o);
            }
            o--;
        }

        //Count divisors and divisible by 3
        int  count1=0;
        int N=6;
        for (int j = 1; j * j <= N; j++) {
            if (N % j == 0) {
                if(j%3==0){
                    count1++;
                    System.out.println("ans iii " +j);
                }
                if((N/j)%3==0 && j!=(N/j)){
                        count1++;
                        System.out.println("ans iii" +(N/j));
                    }
            }
        }
        System.out.println("ans " +count1);


        //Perfect Number - sum of all divisor except N is called perfect number
        int z=8,sum2=0;
        for (int j = 2; j * j <= z; j++) {
            if (z % j == 0) {
                if (j * j == z) {
                    sum2+=j;
                } else {
                   sum2+=j;
                   sum2+=z/j;
                }
            }
        }
        if(sum2+1==z){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }

        //mid element
        int q=10,w=20,e=30;
        int max=Math.max(q,Math.max(w,e));
        int min=Math.min(q,Math.min(w,e));
        if(q!=max && q!=min){
            System.out.println("Mid Element "+ q);
        }
        else if(w!=max && w!=min){
            System.out.println("Mid Element "+ w);
        }
        else {
            System.out.println("Mid Element " + e);
        }

        System.out.println("series sum");
        int t=2 ;
        long sum4=0,tsum=0,psum=0;

        for(long i=1;i<=t;i+=2){
            sum4=sum4+i;
            psum=sum4+ psum;
            System.out.println(psum);
        }

        System.out.println(psum);

        System.out.println("Another series sum");

        int sum5=1,psum1=1,s=2,sum6=1;
        for(int i=2;i<=s;i++){
            psum1=psum1+2;
            sum5=sum5+psum1;
            sum6=sum6+sum5;
        }
        System.out.println(sum6);
    }
}
