package com.GarbageCollection;

public class EncodedStrings {

	public static String getEncodedString(String x, String y, String z) {
		int parts=0, mid=0;
		String front="", middle="", end="";
		String arr[] = {x, y, z};
		for(int i=0; i<arr.length; i++){
			front="";
			middle="";
			end="";
			int len = arr[i].length();
			int part = len%3;
			parts = len/3;
			if(part == 1){
				mid=part;
			}else if(part == 2){
				mid = part;
			}
			else{
				mid=0;
			}
			System.out.println(parts+" "+mid);
			front+=arr[i].substring(0,parts+mid-1);
			middle+=arr[i].substring(parts,parts+parts+mid);
			end+=arr[i].substring(parts+parts,arr[i].length());

			System.out.println(front+" "+middle+" "+end);
			mid=0;
		}
		return "";
	}
	
	public static void main(String[] args) {
		String x = "John";
		String y = "Johny";
		String z = "Janardhan";
		System.out.println(getEncodedString(x, y, z));
		
	}

}
