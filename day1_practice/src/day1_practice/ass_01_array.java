package day1_practice;

import java.util.Scanner;

public class ass_01_array {
	
	public static int[] insert(int arr[],int size,int pos,int ele) {
		int arr2[] = new int[size+1];
		for(int i=0;i<size+1;i++) {
			if(i<pos-1) {
				arr2[i] = arr[i]; 
			}
			else if(i==pos-1) {
				arr2[i] = ele;
			}
			else {
				arr2[i] = arr[i-1];
			}
		}
		return arr2;
	}
	
	public static void printArr(int arr2[],int size) {
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size=5;
		int arr[] = new int[size];

		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int pos = 3;
		int ele = 77;
		
//		int arr2[] = insert(arr,size,pos,ele);
		int arr3[] = remove(arr,size,pos);
//		printArr(arr2, size);
		printArr(arr3, size);
	}
	private static int[] remove(int[] arr, int size, int pos) {
	    int[] arr3 = new int[size - 1];
	    int j=0;
	    for (int i = 0; i < arr.length; i++) {
	        if (i != pos - 1) {
	            arr3[j++] = arr[i];
	        }
	    }
	    return arr3;
	}
}
