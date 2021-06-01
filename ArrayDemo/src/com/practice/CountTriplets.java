package com.practice;

public class CountTriplets {

	public static void main(String[] args) {
		int[] arr={1,5,9,3,17,12,6};
		
		
		int tripletCount= countTriplet(arr,arr.length);
		System.out.println(tripletCount);
	}
	public static int countTriplet(int[] arr,int length){
		int temp,tripletCount=0;
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(arr[i] > arr[j]){
					temp=arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<length;i++){
			for(int j=i+2;j<length;j++){
				
				if(arr[j]==arr[i]+arr[i+1]){
					tripletCount++;
				}
			}
		}
		
		
		
		return tripletCount;
	}

}
