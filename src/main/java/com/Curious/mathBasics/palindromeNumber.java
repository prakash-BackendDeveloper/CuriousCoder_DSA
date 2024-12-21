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
        int N=18;
        for (int j = 1; j * j <= N; j++) {
            if (N % j == 0) {
                if(j%3==0){
                    count1++;
                    System.out.println("ans " +j);
                }
                if((N/j)%3==0){
                        count1++;
                        System.out.println("ans " +(N/j));
                    }
            }
        }
        System.out.println("ans " +count1);
    }
}
