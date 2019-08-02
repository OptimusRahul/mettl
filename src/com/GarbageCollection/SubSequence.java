package com.GarbageCollection;

public class SubSequence {
	
	public static String getSequence(int arr[], int n) {
		
		int count=0, max=0, seq=0;
		boolean status = false;
		for(int i=0; i<n-1; i++) {
			if(arr[i] > arr[i+1]) {
				if(status == false) {
					status = true;
					count++;
				}
				seq++;
				max = seq > max ? seq : max;
			}
			else {
				if(status = true) {
					status =false;
					seq=0;
				}
			}
		}		
		if(count > 0) max++;
		return String.valueOf(count)+" "+String.valueOf(max);
	}
	
	public static void main(String []args) {
		int arr[] = {10,9,22,9,8,7,6};
		int len = arr.length;
		System.out.println(getSequence(arr, len));
	}

}
