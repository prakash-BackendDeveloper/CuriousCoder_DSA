package com.Curious.basicpatterns;

public class Pattern2 {
    public static void main(String[] args) {
        /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
         */
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        int m=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        1 2 3 4
        1 2 3
        1 2
        1
         */
        int x=4;
        for(int i=0;i<x;i++){
            for(int j=1;j<=x-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        *****
        ****
        ***
        **
        *
         */
        int y=5;
        for(int i=1;i<=y;i++){
            for(int j=1;j<=y-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        /*
        *
        **
        ***
        ****
        *****
         */
        int o=5;
        for(int i=1;i<=o;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
