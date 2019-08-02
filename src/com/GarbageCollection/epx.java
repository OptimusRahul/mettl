package com.GarbageCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class epx {

	public static void main(String []args) {
		int mat[][]= {{123},{456},{789}};
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<1; j++) {
				int num = mat[i][j];
				while(num > 0) {
					int temp = num%10;
					ts.add(temp);
					num /= 10;
				}
				
			}
		}
		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
	
}
