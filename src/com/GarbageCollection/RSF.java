package com.GarbageCollection;

public class RSF {
	
	public static int getRSF(int num) {
		String str = String.valueOf(num);
		String res="";
		for(int i=0; i<str.length()-1; i++) {
			res += Math.abs(((int)str.charAt(i)-(int)str.charAt(i+1)));
		}
		if(Integer.parseInt(res)<=9)
			return Integer.parseInt(res);
		return getRSF(Integer.parseInt(res));
	}
	
	
	public static void main(String []args) {
		int num = 5271;
		System.out.println(getRSF(num));
	}
}
