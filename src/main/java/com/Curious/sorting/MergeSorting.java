package com.Curious.sorting;

public class MergeSorting {
    static void merge(int a[],int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int i=start,j=mid+1,k=0;
        while(i<=mid && j<=end){
            if(a[i]<a[j]){
                temp[k]=a[i];
                k++;
                i++;
            }
            else{
                temp[k]=a[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            temp[k]=a[i];
            k++;
            i++;
        }
        while(j<=end){
            temp[k]=a[j];
            k++;
            j++;
        }
        int x=0;
        for(i=start;i<=end;i++){
            a[i]=temp[x];
            x++;
        }

    }
    static void mergeSort(int[] a, int start, int last) {
        if(start>=last) return;
        int mid = (start+last)/2;
        mergeSort(a, start, mid);
        mergeSort(a, mid+1, last);
        merge(a,start,mid,last);
    }
    public static void main(String[] args) {
        int a[]={10,5,12,1,3,17,45,6};
        mergeSort(a,0,a.length-1);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
