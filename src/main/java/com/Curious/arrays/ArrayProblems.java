package com.Curious.arrays;

public class ArrayProblems {
    public static void main(String[] args) {

        // Minimum element in a array
        int a[]={5, 7, 34, 67, 2, 56, 5, 8};
        int min=a[0];
        for(int i=0;i<a.length;i++){
           min=Math.min(min,a[i]);
        }
        System.out.println(min);

        //Printing alternate order
        for(int i=0;i<a.length;i+=2){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //Find Element
        int key=2;
        System.out.print(a[key]+" ");

        System.out.println();

        //Palindrome Array
        int b[]={1,2,3,3,1};
        int i1=0,i2=b.length-1;
        int flag=0;
        while(i1<=i2){
            if(b[i1]!=b[i2]){
                System.out.println("Not a Palindrome");
                flag=1;
                break;
            }
            i1++;
            i2--;
        }
        if(flag==0){
            System.out.println("Palindrome");
        }

        //product of Max of 1st array and min of 2nd array
        int c[]={5, 7, 9, 3, 6, 2};
        int d[]={1, 2, 6, 1, 9};
        int maxOfC=c[0],minOfD=d[0];
        for(int i=0;i<c.length;i++){
            maxOfC=Math.max(maxOfC,c[i]);
        }
        for(int i=0;i<d.length;i++){
            minOfD=Math.min(minOfD,d[i]);
        }
        System.out.println(maxOfC);
        System.out.println(minOfD);
        System.out.println(maxOfC*minOfD);
    }
}
