package com.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = { 12, 11, 13, 5, 6 };

        int len = arr.length;

        for(int i=0;i<len-1;i++) {

            for(int j=i+1;j<len;j++) {

                if(arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0;i<len;i++) {
            System.out.print(arr[i]+ " ");
        }

    }

}