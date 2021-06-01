package com.practice;

public class RotateArray {

	public static void main(String[] args) {
		RotateArray rotate = new RotateArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.leftRotate(arr, 3, 7);
        rotate.printArray(arr, 7);

	}

	private void printArray(int[] arr, int n) {
		for(int i=0;i< n;i++){
			System.out.println(arr[i]);
		}
		
	}

	private void leftRotate(int[] arr, int d, int n) {
		
		for(int i=0;i< d;i++){
			leftRotatebyOne(arr,n);
		}
		
	}

	private void leftRotatebyOne(int[] arr, int n) {
		int temp,i;
		temp=arr[0];
		for(i=0;i<n-1;i++){
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
		
	}

}
