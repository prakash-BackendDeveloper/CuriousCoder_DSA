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

    }
}