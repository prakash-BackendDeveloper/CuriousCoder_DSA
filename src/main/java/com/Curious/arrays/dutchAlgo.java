package com.Curious.arrays;

public class dutchAlgo {
    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void sort012(int[] arr) {
        // code here
        int start=0,mid=0,right=arr.length-1;
        while(mid<=right){
            if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==0){
                swap(arr,mid,start);
                mid++;
                start++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,right);
                right--;
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[]={0, 1, 2, 0, 1, 2};
        sort012(a);
        System.out.println("ans");
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
