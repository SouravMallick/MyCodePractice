package com.practice;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		
		int[] arr={5,6,7,8,9,10};
		int n=arr.length,s=27;
		
		ArrayList<Integer> arrayList = subarraySum(arr,n,s);
		
		arrayList.stream().forEach(x -> System.out.println(x));

	}
	

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        
        int curr_sum,i,j,p;
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        
        for(i=0;i<n;i++){
            curr_sum=arr[i];
            
            System.out.println("i="+i);
            System.out.println("curr_sum="+curr_sum);
            for(j=i+1;j<=n;j++){
            	
            	System.out.println("j="+i);
                System.out.println("curr_sum="+curr_sum);
                if(curr_sum == s){
                    p=i+1;
                    arrayList.add(p);
                    arrayList.add(j);
                    return arrayList;
                }
                
                if(curr_sum > s || j ==n){
                    break;
                }
                curr_sum=curr_sum+arr[j];
            }
        }
        arrayList.add(new Integer(-1));
        return arrayList;
    }

}
