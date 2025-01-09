package com.Curious.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={1,2,9,6,4,8};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        //System.out.println();
        int b[]={1,2,3};
        swap(b);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
    public static void swap(int[] ba){
        int temp=ba[0];
        ba[0]=ba[ba.length-1];
        ba[ba.length-1]=temp;
    }
}
