package com.practice;

public class ReverseArray {

	public static void main(String[] args) {
		ReverseArray reverse = new ReverseArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        reverse.leftRotate(arr, 7,arr.length);
        reverse.printArray(arr, arr.length);

	}

	private void printArray(int[] arr, int n) {
		for(int i=0;i< n;i++){
			System.out.println(arr[i]);
		}
		
	}

	private void leftRotate(int[] arr, int d, int n) {
		if(d==0)
			return;
		if(d>n)
			d=d%n;
		
		reverseArray(arr,0,d-1);
		//reverseArray(arr,d,n-1);
		//reverseArray(arr,0,n-1);
		
	}

	private void reverseArray(int[] arr, int start, int end) {
		int temp;
		while(start<end){
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}


}
