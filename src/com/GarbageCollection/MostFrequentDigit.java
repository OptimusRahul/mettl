package com.GarbageCollection;

public class MostFrequentDigit {
	
	public static int countFrequency(int arr[]){
		int frequencyArr[] = {0,0,0,0,0,0,0,0,0,0};
		int num=0, temp=0;
		for(int i=0; i< arr.length; i++) {
			num = arr[i];
			while(num > 0) {
				temp = num%10;
				frequencyArr[temp] = frequencyArr[temp]+1;
				num /= 10;
			}
		}
		int tmp = frequencyArr[0], index=-1;
		for(int i=0; i<10; i++) {
			if(frequencyArr[i] > tmp) {
				tmp = frequencyArr[i];
				index = i;
				
			}
		}
		return index;
	}	
	
	public static void main(String []args) {
		int arr[] = {1237,202,666,140};
		System.out.println(countFrequency(arr));
	}
	
}
