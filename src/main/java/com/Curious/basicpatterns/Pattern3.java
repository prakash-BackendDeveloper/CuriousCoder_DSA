package com.Curious.basicpatterns;

public class Pattern3 {
    public static void main(String[] args) {
        /*
        Input:

        n = 4

        Expected output:

        4321

        321

        21

        1
        */
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        /*
           *
          ***
         *****
         */
        int m=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            for(int l=1;l<=m-i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        int o=5;
        for(int i=o;i>=1;i--){
            for(int j=1;j<=o-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int x=5;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            for(int l=1;l<=x-i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        int y=x-1;
        for(int i=y;i>=1;i--){
            for(int j=0;j<=y-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
