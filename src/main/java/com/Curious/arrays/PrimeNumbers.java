package com.Curious.arrays;

import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {

        // Print all the prime Numbers from 1 to n
//        int n=10;
//        int a[]=new int[n+1];
//        ArrayList<Integer> al = new ArrayList<>();
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(a[i]==0){
//                for(int j=i*2;j<=n;j=j+i){
//                    a[j]=1;
//                }
//            }
//        }
//        for(int i=2;i<=n;i++){
//            if(a[i]==0){
//                al.add(i);
//            }
//        }
//        System.out.println(al);


        // Sum all the prime Numbers from one number to n -- Range L-15, R-25
        int n=25;
        int a[]=new int[n+1];
        for(int i=2;i<=Math.sqrt(n);i++){
            if(a[i]==0){
                for(int j=i*2;j<=n;j=j+i){
                    a[j]=1;
                }
            }
        }
        int sum=0;
        for(int i=15;i<=n;i++){
            if(a[i]==0){
               sum+=i;
            }
        }
        System.out.println(sum);
    }
}
